# Practica1
P02-30 Git resolución de conflictos
Creación del repositorio:
-Primero enlace mi cuenta de github con intellij
-Para la creación de este repositorio, empece desde Intellij, eligiendo un proyecto que incluia un ".Java" llamado Practica 1.
-Desde el proyecto inicie git, con la opción Enable Version Control Integration.
-Ignore ciertos ficheros como out, que no me interesaban que esten en el repositorio, con la opcion add to git.ignore.
-Y para la creacion del repositorio le di a la opción share project on github.
-Repositorio creado con el nombre Practica 1.

Creacion de carpetas miWebCasa, miWebInsti:
-Creacion de dos carpetas, en las cuales clone el repositorio Practica 1 (git clone).
-Desde la carpeta miWebCasa, Practica1 hice el primer cambio en el fichero .java.
-Añadí los primeros cambios desde git (git add).
-Hice el primer commit (git commit -m).
-Git push para subir los nuevos cambios al repositorio.

Cambios desde carpeta miWebInsti:
-Clonado el repositorio, me dirijo a hacer los primeros cambios y al hacer el push me sale este error: 
To https://github.com/spicordov/Practica1.git

 ! [rejected]        master -> master (fetch first)

error: failed to push some refs to 'https://github.com/spicordov/Practica1.git'

hint: Updates were rejected because the remote contains work that you do

hint: not have locally. This is usually caused by another repository pushing

hint: to the same ref. You may want to first integrate the remote changes

hint: (e.g., 'git pull ...') before pushing again.

hint: See the 'Note about fast-forwards' in 'git push --help' for details.

-Me dice que otro repositorio ha hecho un cambio al repositorio clonado y lo que tengo que hacer es un pull para integrar los cambios del remoto.
-Hago un git pull y git status y git add para agregar los nuevos cambios.
-git commit -m mencionando los nuevos cambios (Este es un cambio desde la carpeta miWebInsti)
-git push para subirlos.

Creacion del README.md:
-creacion desde el github y git pull en las distintas carpetas para añadir el nuevo fichero.
 
 
 Bryan Jesus Rodríguez Ríos


