@echo off

if "%1"=="" (
  echo Usage %~nx0 ^<filename^>
  exit
)

rem set JAVA_HOME=C:\Program Files\Java\jdk1.7.0_11
rem set JAVA_HOME=C:\Program Files\Java\jdk1.6.0_11
set JAVA_HOME=C:\Program Files\Java\jdk1.7.0_80


set JAVAC="%JAVA_HOME%\bin\javac.exe"
set JAVAP="%JAVA_HOME%\bin\javap.exe"
set JASPER="%JAVA_HOME%\bin\java.exe" -jar "%~dp0\Jasper.jar"
set JASMIN="%JAVA_HOME%\bin\java.exe" -jar "%~dp0\jasmin.jar"



set FILENAME=%~n1

del %FILENAME%.class %FILENAME%.j >nul 2>nul

%JAVAC% %FILENAME%.java
rem %JAVAP% -p -c %FILENAME%.class >%FILENAME%.javap
%JASPER% %FILENAME%.class
del %FILENAME%.class >nul 2>nul
%JASMIN% %FILENAME%.j
"%JAVA_HOME%\bin\java.exe" %FILENAME%