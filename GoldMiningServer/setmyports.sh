#!/bin/sh
#
# This script changes the ports used by the massim-server and its
# rmiregistry.
# It does this by changing the startServer script and the serverconfig.xml
# configuration file to hold the new port numbers. The rmi port number in
# startServer is a line of form "rmi=nnnn". The server port number in
# serverconfig.xml is a line of form "...port="nnnn"...".


NO_ARGS=$#

##### TEST ALL ARGUMENTS ARE THERE
if [ "$NO_ARGS" != 2 ]; then
  printf "setmyports.sh: change the RMI and game port number of the game server\n\n"
  printf "USAGE: setmyports.sh <rmiport> <gameport> \n\n"
  printf "For example: setmyports.sh 1023 12310\n"
  exit
fi


f=startServer.sh
mv $f $f.old
cat $f.old | sed -e "s/rmi=[0-9]*/rmi=$1/" > startServer.sh
diff $f.old $f
chmod 755 $f

f=conf/serverconfig.xml
mv  $f $f.old
cat $f.old | sed -e "s/port=\"[0-9]*\"/port=\"$2\"/" > "$f"
diff $f.old $f

