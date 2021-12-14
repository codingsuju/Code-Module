@echo off
cd %~dp0
set /p language=language:
set /p snips=snippet:
cd ../Snips
cd %language%snippets
type %snips%.%language% >> ../../Code.%language%
