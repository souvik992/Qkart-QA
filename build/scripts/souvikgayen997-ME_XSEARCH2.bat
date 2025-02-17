@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      http://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  souvikgayen997-ME_XSEARCH2 startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and SOUVIKGAYEN997_ME_XSEARC_H2_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\souvikgayen997-ME_XSEARCH2-1.0-SNAPSHOT.jar;%APP_HOME%\lib\webdrivermanager-4.4.3.jar;%APP_HOME%\lib\selenium-java-4.0.0-alpha-1.jar;%APP_HOME%\lib\httpclient5-5.0.3.jar;%APP_HOME%\lib\slf4j-api-1.7.30.jar;%APP_HOME%\lib\commons-io-2.8.0.jar;%APP_HOME%\lib\gson-2.8.6.jar;%APP_HOME%\lib\commons-lang3-3.12.0.jar;%APP_HOME%\lib\jarchivelib-1.1.0.jar;%APP_HOME%\lib\jsoup-1.13.1.jar;%APP_HOME%\lib\selenium-chrome-driver-4.0.0-alpha-1.jar;%APP_HOME%\lib\selenium-edge-driver-4.0.0-alpha-1.jar;%APP_HOME%\lib\selenium-firefox-xpi-driver-4.0.0-alpha-1.jar;%APP_HOME%\lib\selenium-ie-driver-4.0.0-alpha-1.jar;%APP_HOME%\lib\selenium-opera-driver-4.0.0-alpha-1.jar;%APP_HOME%\lib\selenium-safari-driver-4.0.0-alpha-1.jar;%APP_HOME%\lib\selenium-support-4.0.0-alpha-1.jar;%APP_HOME%\lib\httpcore5-h2-5.0.2.jar;%APP_HOME%\lib\httpcore5-5.0.2.jar;%APP_HOME%\lib\commons-codec-1.13.jar;%APP_HOME%\lib\commons-compress-1.20.jar;%APP_HOME%\lib\selenium-firefox-driver-4.0.0-alpha-1.jar;%APP_HOME%\lib\selenium-remote-driver-4.0.0-alpha-1.jar;%APP_HOME%\lib\selenium-api-4.0.0-alpha-1.jar;%APP_HOME%\lib\byte-buddy-1.9.12.jar;%APP_HOME%\lib\commons-exec-1.3.jar;%APP_HOME%\lib\guava-27.1-jre.jar;%APP_HOME%\lib\okhttp-3.14.0.jar;%APP_HOME%\lib\failureaccess-1.0.1.jar;%APP_HOME%\lib\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\checker-qual-2.5.2.jar;%APP_HOME%\lib\error_prone_annotations-2.2.0.jar;%APP_HOME%\lib\j2objc-annotations-1.1.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.17.jar;%APP_HOME%\lib\okio-1.17.2.jar

@rem Execute souvikgayen997-ME_XSEARCH2
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %SOUVIKGAYEN997_ME_XSEARC_H2_OPTS%  -classpath "%CLASSPATH%" apTests.App %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable SOUVIKGAYEN997_ME_XSEARC_H2_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%SOUVIKGAYEN997_ME_XSEARC_H2_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
