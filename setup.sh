# personal information
git config --global user.name "Juan Antonio Plaza"
git config --global user.email juan@example.com

# editor
git config --global core.editor "'c:/program files/sublime text 3/subl.exe' -w"

# mergetool setup Windows
git config --global merge.tool winmerge
git config --replace --global mergetool.winmerge.cmd "\"C:\Program Files (x86)\WinMerge\WinMergeU.exe\" -e -u -dl \"Base\" -dr \"Mine\" \"$LOCAL\" \"$REMOTE\" \"$MERGED\""
git config --global mergetool.prompt false