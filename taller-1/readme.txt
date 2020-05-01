# Obtención de resultados

Pre-requisitos:
	- Descargar y configurar el entorno para poder ejecutar java y soot según el manual del taller.

Ejercicio 1:
	- Escribir el código del ejercicio 1 en un archivo java, llamado A.java
	- Compilar el archivo A.java a A.class ejecutando:
		javac -g A.java
	- Ejecutar soot con A.class, indicando que se quiere utilizar el pack "Reaching Defs Tagger" con la opción "-p jap.rdtagger":
		java -cp .:soot-3.3.0-jar-with-dependencies.jar:. soot.Main -cp .:$JRE -f J A -print-tags -p jap.rdtagger enabled:true -p jb use-original-names:true -p jb.cp off -keep-line-number
	- Analizar el archivo A.jimple generado

Ejercicio 2:
	- Escribir el código del ejercicio 2 en un archivo java, llamado B.java
	- Compilar el archivo B.java a B.class ejecutando:
		javac -g B.java
	- Ejecutar soot con B.class, indicando que se quiere utilizar el pack "Live Variables Tagger" con la opción "-p jap.lvtagger":
		java -cp .:soot-3.3.0-jar-with-dependencies.jar:. soot.Main -cp .:$JRE -f J B -print-tags -p jap.lvtagger enabled:true -p jb use-original-names:true -p jb.cp off -keep-line-number
	- Analizar el archivo B.jimple generado

Ejercicio 3:
	- Escribir el código del ejercicio 3 en un archivo java, llamado C.java
	- Compilar el archivo C.java a C.class ejecutando:
		javac -g C.java
	- Ejecutar soot con C.class, indicando que se quiere utilizar el pack "Null Pointer Checker" con la opción "-p jap.npc":
		java -cp .:soot-3.3.0-jar-with-dependencies.jar:. soot.Main -cp .:$JRE -f J C -print-tags -p jap.npc enabled:true -p jb use-original-names:true -p jb.cp off -keep-line-number
	- Analizar el archivo C.jimple generado
