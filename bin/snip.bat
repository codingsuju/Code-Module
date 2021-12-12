@echo off
cd %~dp0
set /p language=Enter language:
set /p snips=Enter snippet name:
cd ../Snips
cd %language%snippets
type %snips%.%language% >> ../../Code.%language%
