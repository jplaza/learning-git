git init
$null > README.md
$null > CHANGELOG.md
git add -A
git commit -m "Inicio del proyecto. Equipo A"
git remote add origin https://github.com/broadnetla/aprendiendo-git
git push origin master

git clone https://github.com/broadnetla/aprendiendo-git
git add index.html
git commit -m "Cambios equipo B"

git clone https://github.com/broadnetla/aprendiendo-git
rem Cambios a:
rem - README.md
rem -- Actualizar la descripción del proyecto
git add -A
git commit
rem Mensaje de commit:
rem Actualización de la descipción de la aplicación
rem 
rem Anteriormente las características estaban descritas en la redacción de la
rem descripción, con este cambio se agregó un listado de características que
rem tendrá la aplicación.