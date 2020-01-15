#!/bin/bash

rm -rf ./natcross2
git clone https://github.com/Pluto-Whong/natcross2.git ./natcross2
mvn clean compile install -Dmaven.test.skip=true -f ./natcross2
  
rm -rf ./source_code

git clone https://github.com/Pluto-Whong/natcross-boot-client.git ./source_code

mvn clean compile package -Dmaven.test.skip=true -f ./source_code/

. ./stop.sh

rm -rf natcross-booa-client.jar
cp ./source_code/target/natcross-boot-client.jar ./
