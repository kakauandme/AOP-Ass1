#!/bin/sh
###############################################################                                               
# Multi-Agent Programming Contest 2007                        #                                               
#                                                             #                                               
# Support package <name>                                      #                                               
#   <short desc what the package does>                        #                                               
#                                                             #                                               
# For the details on the contest, check the Contest website:  #                                               
# http://cig.in.tu-clausthal.de/AgentContest2007/             #                                               
#                                                             #                                               
# Organizers:                                                 #                                               
#    J. Dix, M. Dastani, P. Novak                             #                                               
###############################################################                                               

######################################################################
# Created by Xavier Queralt
#
# Modified by Sebastian Sardina - July 2007
#      - Added the RMI port as an option
#      - Changed the way rmiregistry process is killed
######################################################################

name=127.0.0.1
rmi=11100

clear
echo "Killall RMI Registry"
ps -u $USER | grep rmireg | awk '{print $1}' | xargs -n2 kill > /dev/null 2>/dev/null

sleep 2

echo "Launching RMI Registry"
rmiregistry $rmi &
sleep 1

echo "Please run the agents....."

echo "Launching Server"
props="-Djava.rmi.server.hostname=$name -Djava.rmi.activation.port=$rmi  -Xmx40m -jar lib/massimserver.jar --conf conf/serverconfig.xml"

java $props

echo "Killall RMI Registry"
ps -u $USER | grep rmireg | awk '{print $1}' | xargs -n2 kill

###########################################################################################

