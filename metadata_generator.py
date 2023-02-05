import os
from os.path import join
from pprint import pprint
import shutil
import json

id = 0
result = []


for project in os.listdir("dataset"):
    print("Starting {}".format(project))
    for child in os.listdir(join("dataset", project)):
        print("Child is dataset/{}/{}".format(project, child))
        for subchild in os.listdir(join("dataset", project, child)):
            print("Subhild is dataset/{}/{}/{}".format(project, child, subchild))
            id += 1
            short_name = "{}-{}".format(project, child[0:6])
            result.append(
                {
                    "id": id,
                    "bug_id": subchild,
                    "subject": short_name,
                    "source_file": "introclassJava.{}_{}_{}".format(project, child[0:8], subchild),
                    "source_directory": "src/main/java",
                    "class_directory": "target/classes",
                    "line_numbers": [],
                    "dependencies": [],
                    "passing_test": [],
                    "failing_test": [],
                    "test_directory": "src/test/java",
                    "test_class_directory": "target/test-classes",
                    "count_pos": 0,
                    "count_neg": 0,
                    "test_timeout": 5,
                }
            )
            shutil.copytree(
                join("dataset", project, child, subchild),
                join(short_name, subchild),
                dirs_exist_ok = True
            )

x = open("meta-data.json", "w")
x.write(json.dumps(result, indent=4))
x.close()
