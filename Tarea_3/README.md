<div align = "justify">

# Manipulación avanzada de Git

Trabajo hecho por: ***Alejandro Tomás Pacheco Rodríguez***

## Índice

-[Ejercicio 1](#ejercicio-1)  
-[Ejercicio 2](#ejercicio-2)  

## Ejercicio 1 <a name = "ejercicio-1"></a>  
Mostrar el historial de cambios del repositorio.  
Crear la carpeta capítulos y crear dentro de ella el fichero capitulo1.txt con el siguiente texto.  
Git es un sistema de control de versiones ideado por Linus Torvalds.  
Añadir los cambios a la zona de intercambio temporal.  
Hacer un commit de los cambios con el mensaje Añadido capítulo 1.
Volver a mostrar el historial de cambios del repositorio.  

Operaciones a realizar:

```code
git log
mkdir capitulos
nano capitulos/capitulo1.txt
Git es un sistema de control de versiones ideado por Linus Torvalds.
git add .
git commit -m "Añadido capítulo 1."
git log
 ```
 - git log
   - salida:
   ```code
   dam@a108pc12:~/libro$ git log
   commit 1016a8a4e53ee1167750094aaac7d2018063a264 (HEAD -> main, origin/main, origin/HEAD)
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Wed Sep 27 15:50:15 2023 +0100

    se añade la segunda carpeta

   commit 3f26704336e8d586f91aca272c89218d96e61d98
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Wed Sep 27 15:21:53 2023 +0100

    mensaje

   commit 8a81c55462cc731099b5842f2cd38fbc47105d56
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Mon Oct 10 18:18:08 2022 +0100

    Se añade un título

   commit fbe91b280cfbc50352ee18627a4339d4aa7e91c4
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Mon Oct 10 18:14:01 2022 +0100
   ```

 - mkdir capítulos
   - salida:
   ```code
   dam@a108pc12:~/libro$ mkdir capitulos
   ```
 - nano capitulos/capitulo1.txt
   - salida:
   ```code
   dam@a108pc12:~/libro$ nano capitulos/capitulo1.txt
   ```
 - git add .
   - salida:
   ```code
   dam@a108pc12:~/libro$ git add .
   ```
 - git commit -m "Añadido el capítulo 1."
   - salida: 
   ```code
   dam@a108pc12:~/libro$ git commit -m "Añadido el capítulo 1"
   [main a842601] Añadido el capítulo 1
    1 file changed, 1 insertion(+)
    create mode 100644 capitulos/capitulo1.txt
   ```
 - git log
   - salida:
   ```code
   dam@a108pc12:~/libro$ git log
   commit a842601ee15e77177ab97e991a4805c739252482 (HEAD -> main)
   Author: ATPRodriguez <alejandrotomaspachecorodriguez@gmail.com>
   Date:   Fri Oct 6 19:08:18 2023 +0100

    Añadido el capítulo 1

   commit 1016a8a4e53ee1167750094aaac7d2018063a264 (origin/main, origin/HEAD)
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Wed Sep 27 15:50:15 2023 +0100

    se añade la segunda carpeta

   commit 3f26704336e8d586f91aca272c89218d96e61d98
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Wed Sep 27 15:21:53 2023 +0100

    mensaje

   commit 8a81c55462cc731099b5842f2cd38fbc47105d56
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Mon Oct 10 18:18:08 2022 +0100

    Se añade un título

   commit fbe91b280cfbc50352ee18627a4339d4aa7e91c4
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Mon Oct 10 18:14:01 2022 +0100

    closed #1

   commit 3ea9800cc58f6e37a0ff3e6878bf9cc99dd17ced (origin/1)
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com> 
   Date:   Mon Oct 10 17:58:02 2022 +0100

    se crea la carpeta img #1

   commit 4dcb74b18a32f24061bc2e7c415f09f7aaff4971
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Mon Sep 27 11:57:59 2021 +0100

    Initial commit
   ``` 

## Ejercicio 2 <a name = "ejercicio-2"></a>

Crear el fichero capitulo2.txt en la carpeta capítulos con el siguiente texto.  

 El flujo de trabajo básico con Git consiste en:   
 1- Hacer cambios en el repositorio.   
 2- Añadir los cambios a la zona de intercambio temporal.   
 3- Hacer un commit de los cambios.  
 Añadir los cambios a la zona de intercambio temporal.  
Hacer un commit de los cambios con el mensaje Añadido capítulo 2.  
Mostrar las diferencias entre la última versión y dos versiones anteriores.

Operaciones a realizar:  
```code
nano capitulos/capitulo2.txt
 El flujo de trabajo básico con Git consiste en:
 1- Hacer cambios en el repositorio.
 2- Añadir los cambios a la zona de intercambio temporal.
 3- Hacer un commit de los cambios.
git add .
git commit -m "Añadido capítulo 2."
git diff HEAD~2..HEAD
```
 - nano capitulos/capitulo2.txt
   - salida:  
   ```code
   dam@a108pc12:~/libro$ nano capitulos/capitulo2.txt
   ```
 - git add .
   - salida:
   ```code  
   dam@a108pc12:~/libro$ git add .
   ```
 - git commit -m "Añadido capítulo 2"
   - salida:
   ```code
   dam@a108pc12:~/libro$ git commit -m "Añadido capítulo 2"
   [main ab60123] Añadido capítulo 2
    1 file changed, 4 insertions(+)
    create mode 100644 capitulos/capitulo2.txt
   ```
 - git diff HEAD~2
   - salida:
   ```code
   dam@a108pc12:~/libro$ git commit -m "Añadido capítulo 2"
   [main ab60123] Añadido capítulo 2
    1 file changed, 4 insertions(+)
    create mode 100644 capitulos/capitulo2.txt
   dam@a108pc12:~/libro$ git diff HEAD~2..HEAD
   diff --git a/capitulos/capitulo1.txt b/capitulos/capitulo1.txt
   new file mode 100644
   index 0000000..7431f9e
   --- /dev/null
   +++ b/capitulos/capitulo1.txt
   @@ -0,0 +1 @@
   +Git es un sistema de control de versiones ideado por Linus Torvalds.
   diff --git a/capitulos/capitulo2.txt b/capitulos/capitulo2.txt
   new file mode 100644
   index 0000000..0070310
   --- /dev/null
   +++ b/capitulos/capitulo2.txt
   @@ -0,0 +1,4 @@
   +El flujo de trabajo básico con Git consiste en:
   +1- Hacer cambios en el repositorio.
   +2- Añadir los cambios a la zona de intercambio temporal.
   +3- Hacer un commit de los cambios.
   ```

## Ejercicio 3 <a name = "ejercicio-3"></a>

Crear el fichero capitulo3.txt en la carpeta capítulos con el siguiente texto.  
Git permite la creación de ramas lo que permite tener distintas versiones del mismo proyecto y trabajar de manera simultanea en ellas.  

Añadir los cambios a la zona de intercambio temporal.  
Hacer un commit de los cambios con el mensaje Añadido capítulo 3.  
Mostrar las diferencias entre la primera y la última versión del repositorio.

Operaciones a realizar:

```code
nano capitulos/capitulo3.txt
 Git permite la creación de ramas lo que permite tener distintas versiones del mismo proyecto y trabajar de manera simultanea en ellas.
git add .
git commit -m "Añadido capítulo 3."
git log
 git diff <codigo hash de la primera version>..HEAD
```
  - nano capitulos/capitulo3.txt
    - salida:
    ```code
    dam@a108pc12:~/libro$ nano capitulos/capitulo3.txt
    ```
 - git add .
   - salida:
   ```code
   dam@a108pc12:~/libro$ git add .
   ```
 - git commit -m "Añadido capitulo 3"
   - salida:
   ```code
   dam@a108pc12:~/libro$ git commit -m "Añadido capitulo 3"
    [main d27e86b] Añadido capitulo 3
     1 file changed, 1 insertion(+)
     create mode 100644 capitulos/capitulo3.txt
    ```
 - git log
   - salida:
   ```code
   dam@a108pc12:~/libro$ git log
   commit d27e86b8523ceeb3a3b3e4cfddb19d79eb41a89b (HEAD -> main)
   Author: ATPRodriguez <alejandrotomaspachecorodriguez@gmail.com>
   Date:   Fri Oct 6 19:34:03 2023 +0100

       Añadido capitulo 3

   commit ab6012349435dfdd62982b964817598cca2539d0
   Author: ATPRodriguez <alejandrotomaspachecorodriguez@gmail.com>
   Date:   Fri Oct 6 19:22:33 2023 +0100

    Añadido capítulo 2

   commit a842601ee15e77177ab97e991a4805c739252482
   Author: ATPRodriguez <alejandrotomaspachecorodriguez@gmail.com>
   Date:   Fri Oct 6 19:08:18 2023 +0100

       Añadido el capítulo 1

   commit 1016a8a4e53ee1167750094aaac7d2018063a264 (origin/main, origin/HEAD)
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Wed Sep 27 15:50:15 2023 +0100

    se añade la segunda carpeta

   commit 3f26704336e8d586f91aca272c89218d96e61d98
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Wed Sep 27 15:21:53 2023 +0100

       mensaje

   commit 8a81c55462cc731099b5842f2cd38fbc47105d56
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Mon Oct 10 18:18:08 2022 +0100

       Se añade un título

   commit fbe91b280cfbc50352ee18627a4339d4aa7e91c4
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Mon Oct 10 18:14:01 2022 +0100

       closed #1

   commit 3ea9800cc58f6e37a0ff3e6878bf9cc99dd17ced (origin/1)
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Mon Oct 10 17:58:02 2022 +0100

       se crea la carpeta img #1

    commit 4dcb74b18a32f24061bc2e7c415f09f7aaff4971
   Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
   Date:   Mon Sep 27 11:57:59 2021 +0100

       Initial commit
   ```
 - git diff < codigo hash de la primera version >..HEAD
   - salida:
   ```code
   dam@a108pc12:~/libro$ git diff <codigo hash de la primera version>..HEAD
   bash: codigo: No existe el archivo o el directorio
   ```

## Ejercicio 4 <a name = "ejercicio-4"></a>

Crea el fichero índice.txt la siguiente línea:

Indice de los cápitulos, con conceptos avanzados de git

Añadir los cambios a la zona de intercambio temporal.
Hacer un commit de los cambios con el mensaje "Indice de los cápitulos, con conceptos avanzados de git.
Mostrar quién ha hecho cambios sobre el fichero indice.txt.

Operaciones a realizar:

```code
nano indice.txt
git add .
git commit -m "Se crea el indice."
echo "Indice de los cápitulos, con conceptos avanzados de git" >> indice.txt
git add .
git commit -m "Añadido el índice ."
git annotate indice.txt
```
 - nano indice.txt
   - salida:
   ```code
   dam@a108pc12:~/libro$ nano indice.txt
   ```
 - git add .
   - salida:
   ```code
   dam@a108pc12:~/libro$ git add .
   ```
 - git commit -m "Se crea el indice"
   - salida:
   ```code
   dam@a108pc12:~/libro$ git commit -m "Se crea el indice"
   [main 435b057] Se crea el indice
    1 file changed, 1 insertion(+)
    create mode 100644 indice.txt
   ```
 - echo "Indice de los capitulos, con conceptos avanzados de git" >> indice.txt 
   - salida:
   ```code
   dam@a108pc12:~/libro$ echo "Indice de los capitulos, con conceptos avanzados de git" >> indice.txt
   ```
 - git add .
   - salida:
   ```code
   dam@a108pc12:~/libro$ git add .
   ```   
 - git commit -m "Añadido el índice ."
   - salida:
   ```code
   dam@a108pc12:~/libro$ git commit -m "Añadido el indice."
   [main 17313b4] Añadido el indice.
    1 file changed, 1 insertion(+)
   ```
 - git annotate indice.txt
   - salida:
   ```code
   dam@a108pc12:~/libro$ git annotate indice.txt
   435b057e        (ATPRodriguez   2023-10-06 19:56:27 +0100       1)Indice de los cápitulos, con conceptos avanzados de git
   17313b4e        (ATPRodriguez   2023-10-06 19:59:59 +0100       2)Indice de los capitulos, con conceptos avanzados de git
   ```

## Ejercicio 5 <a name = "ejercicio-5"></a>

Crear una nueva rama bibliografía y mostrar las ramas del repositorio.

Operaciones a realizar:
```code
git branch bibliografia
git branch -av
```

 - git branch bibliografia
   - salida:
   ```code
   dam@a108pc12:~/libro$ git branch bibliografia
   ```
 - git branch -av
   - salida:
   ```code
   dam@a108pc12:~/libro$ git branch -av
     bibliografia        17313b4 Añadido el indice.
   * main                17313b4 [adelante 5] Añadido el indice.
     remotes/origin/1    3ea9800 se crea la carpeta img #1
     remotes/origin/HEAD -> origin/main
     remotes/origin/main 1016a8a se añade la segunda carpeta
   ```

## Ejercicio 6 <a name = "ejercicio-6"></a>

Crear el fichero capitulos/capitulo4.txt y añadir el texto siguiente:

En este capítulo veremos cómo usar GitHub para alojar repositorios en remoto.

Añadir los cambios a la zona de intercambio temporal.
Hacer un commit con el mensaje “Añadido capítulo 4.”
Mostrar la historia del repositorio incluyendo todas las ramas.

Operaciones a realizar:

```code
nano capitulos/capitulo4.txt
En este capítulo veremos cómo usar GitHub para alojar repositorios en remoto.
git add .
git commit -m "Añadido capítulo 4."
git log --graph --all --oneline
```
- nano
  - salida:
  dam@a108pc12:~/libro$ nano capitulos/capitulo4.txt

- git add 
  - salida: dam@a108pc12:~/libro$ git add .

- git commit
  - salida: dam@a108pc12:~/libro$ git commit -m "Añadido el capitulo 4"
[main 22784b8] Añadido el capitulo 4
 1 file changed, 1 insertion(+)
 create mode 100644 capitulos/capitulo4.txt

 - git log -- graph --all --oneline 
   - salida: dam@a108pc12:~/libro$ git log -- graph --all --oneline 

## Ejercicio 7 <a name = "Ejercicio 7"></a>

    Cambiar a la rama bibliografía.
    Crear el fichero bibliografia.txt y añadir la siguiente referencia:

Chacon, S. and Straub, B. Pro Git. Apress.

    Añadir los cambios a la zona de intercambio temporal.
    Hacer un commit con el mensaje “Añadida primera referencia bibliográfica.”
    Mostrar la historia del repositorio incluyendo todas las ramas.

Operaciones a realizar:
```code
 git checkout bibliografia
 cat > bibliografia.txt
 - Chacon, S. and Straub, B. Pro Git. Apress.
 git add .
git commit -m "Añadida primera referencia bibliográfica."
git log --graph --all --oneline
```

 - git checkout
   - salida:
   dam@a108pc12:~/libro$ git checkout bibliografia
Cambiado a rama 'bibliografia'
 
 - nano bibliografia.txt
   - salida: dam@a108pc12:~/libro$ nano bibliografia.txt
 - git add .
   - salida: dam@a108pc12:~/libro$ git add .
- git commit -m "Añadida primera referencia bibliografica."
 - salida: dam@a108pc12:~/libro$ git commit -m "Añadida primera referencia bibliografica"
[bibliografia 6e0b7af] Añadida primera referencia bibliografica
 1 file changed, 1 insertion(+)
 create mode 100644 bibliografia.txt

 - git log
   - salida: dam@a108pc12:~/libro$ git log --graph --all --oneline
* 6e0b7af (HEAD -> bibliografia) Añadida primera referencia bibliografica
| * 22784b8 (main) Añadido el capitulo 4
|/  
* 17313b4 Añadido el indice.
* 435b057 Se crea el indice
* d27e86b Añadido capitulo 3
* ab60123 Añadido capítulo 2
* a842601 Añadido el capítulo 1
* 1016a8a (origin/main, origin/HEAD) se añade la segunda carpeta
* 3f26704 mensaje
* 8a81c55 Se añade un título
* fbe91b2 closed #1
* 3ea9800 (origin/1) se crea la carpeta img #1
* 4dcb74b Initial commit

</details>

## Ejercicio 8

 - Fusionar la rama bibliografía con la rama main.
 - Mostrar la historia del repositorio incluyendo todas las ramas.
 - Eliminar la rama bibliografía.
 - Mostrar de nuevo la historia del repositorio incluyendo todas las ramas.


Operaciones a realizar:
 ```console
  git checkout main
  git merge bibliografia
  git log --graph --all --oneline
  git branch -d bibliografia
  git log --graph --all --oneline
 ```

 </details>

- git checkout
  - salida: dam@a108pc12:~/libro$ git checkout main
Cambiado a rama 'main'
Tu rama está adelantada a 'origin/main' por 6 commits.
  (usa "git push" para publicar tus commits locales)

- git merge bibliografia
  - salida:dam@a108pc12:~/libro$ git merge bibliografia
Merge made by the 'ort' strategy.
 bibliografia.txt | 1 +
 1 file changed, 1 insertion(+)
 create mode 100644 bibliografia.txt

- git log
  - salida: dam@a108pc12:~/libro$   git log --graph --all --oneline
*   3cec4d5 (HEAD -> main) Merge branch 'bibliografia'
|\  
| * 6e0b7af (bibliografia) Añadida primera referencia bibliografica
* | 22784b8 Añadido el capitulo 4
|/  
* 17313b4 Añadido el indice.
* 435b057 Se crea el indice
* d27e86b Añadido capitulo 3
* ab60123 Añadido capítulo 2
* a842601 Añadido el capítulo 1
* 1016a8a (origin/main, origin/HEAD) se añade la segunda carpeta
* 3f26704 mensaje
* 8a81c55 Se añade un título
* fbe91b2 closed #1
* 3ea9800 (origin/1) se crea la carpeta img #1
* 4dcb74b Initial commit

- git branch -d bibliografia
  - salida: dam@a108pc12:~/libro$ git branch -d bibliografia
Eliminada la rama bibliografia (era 6e0b7af).

- git log
  - salida: dam@a108pc12:~/libro$   git log --graph --all --oneline
*   3cec4d5 (HEAD -> main) Merge branch 'bibliografia'
|\  
| * 6e0b7af Añadida primera referencia bibliografica
* | 22784b8 Añadido el capitulo 4
|/  
* 17313b4 Añadido el indice.
* 435b057 Se crea el indice
* d27e86b Añadido capitulo 3
* ab60123 Añadido capítulo 2
* a842601 Añadido el capítulo 1
* 1016a8a (origin/main, origin/HEAD) se añade la segunda carpeta
* 3f26704 mensaje
* 8a81c55 Se añade un título
* fbe91b2 closed #1
* 3ea9800 (origin/1) se crea la carpeta img #1
* 4dcb74b Initial commit

## Ejercicio 9
 - Crear la rama bibliografía.
 - Cambiar a la rama bibliografía.
 - Cambiar el fichero bibliografia.txt para que contenga las siguientes referencias:
```cosole
Scott Chacon and Ben Straub. Pro Git. Apress.
Ryan Hodson. Ry’s Git Tutorial. Smashwords (2014)
```
 - Cambiar a la rama main.
 - Cambiar el fichero bibliografia.txt para que  - contenga las siguientes referencias:
```console
Chacon, S. and Straub, B. Pro Git. Apress.
Loeliger, J. and McCullough, M. Version control with Git. O’Reilly.
```
 - Añadir los cambios a la zona de intercambio temporal y hacer un commit con el mensaje “Añadida nueva referencia bibliográfica.”
 - Fusionar la rama bibliografía con la rama main.
 - Resolver el conflicto dejando el fichero bibliografia.txt con las referencias:
```console
Chacon, S. and Straub, B. Pro Git. Apress.
Loeliger, J. and McCullough, M. Version control with Git. O’Reilly.
```
Hodson, R. Ry’s Git Tutorial. Smashwords (2014)
 - Añadir los cambios a la zona de intercambio temporal y hacer un commit con el mensaje “Resuelto conflicto de bibliografía.”
 - Mostrar la historia del repositorio incluyendo todas las ramas.

Operaciones a realizar: 

 ```console
 git branch bibliografia
 git checkout bibliografia
 cat > bibliografia.txt
 - Scott Chacon and Ben Straub. Pro Git. Apress.
 - Ryan Hodson. Ry's Git Tutorial. Smashwords (2014)
 ```
 
 ```
 git commit -a -m "Añadida nueva referencia bibliográfica."
 git checkout main
 cat > bibliografia.txt
 - Chacon, S. and Straub, B. Pro Git. Apress.
 - Loeliger, J. and McCullough, M. Version control with Git. O'Reilly.
 ```
 
 ```
 git commit -a -m "Añadida nueva referencia bibliográfica."
 git merge bibliografia
 git nano bibliografia
 # Hacer los cambios indicados en el fichero
 git commit -a -m "Solucionado conflicto bibliografía."
 git log --graph --all --oneline
 ```

- git branch
   - salida: dam@a108pc12:~/libro$ git branch bibliografia

- git checkout bibliografia
  - salida: dam@a108pc12:~/libro$ git checkout bibliografia
Cambiado a rama 'bibliografia'

- nano bibliografia.txt
  - salida: dam@a108pc12:~/libro$ nano bibliografia.txt

- git commit
   - salida: am@a108pc12:~/libro$  git commit -a -m "Añadida nueva referencia bibliográfica."
[bibliografia ac4fffc] Añadida nueva referencia bibliográfica.
 1 file changed, 1 insertion(+)
- git merge
  - salida: dam@a108pc12:~/libro$ git merge bibliografia
Actualizando 3cec4d5..ac4fffc
Fast-forward
 bibliografia.txt | 1 +
 1 file changed, 1 insertion(+)

- git nano
  - salida: dam@a108pc12:~/libro$ git nano bibliografia.txt
git: 'nano' no es un comando de git. Mira 'git --help'.

Los comandos más similares son
	annotate
	daemon

- git commit 
  - salida: dam@a108pc12:~/libro$ git commit -a -m "Solucionado conflicto bibliografía."
En la rama main
Tu rama está adelantada a 'origin/main' por 9 commits.
  (usa "git push" para publicar tus commits locales)

nada para hacer commit, el árbol de trabajo está limpio

- git log
  - salida: dam@a108pc12:~/libro$ git log --graph --all --oneline
* ac4fffc (HEAD -> main, bibliografia) Añadida nueva referencia bibliográfica.
*   3cec4d5 Merge branch 'bibliografia'
|\  
| * 6e0b7af Añadida primera referencia bibliografica
* | 22784b8 Añadido el capitulo 4
|/  
* 17313b4 Añadido el indice.
* 435b057 Se crea el indice
* d27e86b Añadido capitulo 3
* ab60123 Añadido capítulo 2
* a842601 Añadido el capítulo 1
* 1016a8a (origin/main, origin/HEAD) se añade la segunda carpeta
* 3f26704 mensaje
* 8a81c55 Se añade un título
* fbe91b2 closed #1
* 3ea9800 (origin/1) se crea la carpeta img #1
* 4dcb74b Initial commit


</div>