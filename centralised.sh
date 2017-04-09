# Step 0
# Create the new repo in github

# Step 1
# Everybody clone!
git clone https://github.com/ORGNAME/intro-git

# Step 2 - Team A
cp ../learning-git/res/MyNumber.java MyNumber.java
cp ../learning-git/res/Range.java Range.java
cp ../learning-git/res/Attack.java Attack.java
git add -A
git commit -m "Versión inicial."
git push origin master

# Step 3 - Team B - see merge in action
touch CHANGELOG.md
# Add something to CHANGELOG.md
git add -A
git commit -m "Agrega archivo para detalle de cada versión"
git push origin master
# Should fail because it's not up to date, so you should pull upstream changes
# The default method is merge.
git pull origin master

# Step 4 - Team C - See rebase in action
# Add a README file
touch README.md
# Add a project description
git add -A
git commit -m "Agrega README con objetivos del proyecto"
