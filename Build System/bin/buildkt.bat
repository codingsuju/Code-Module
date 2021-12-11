@echo off
echo Status:Compiling Code
call kotlinc Code.kt -include-runtime -d Code.jar
echo Status: Running your Code
java -jar Code.jar
rm java.jar
pause
