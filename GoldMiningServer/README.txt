===============================================================================
FILE: README.txt
DATE: 07/07/2007

File massim-server.zip contains the clima game server packed, its
configuration file, and its startup script. It also contains a shell script
which can be used to change the two main ports used by the server.
===============================================================================


===============================================================================
A. QUICK HOW TO:

1. unzip the zip file in the directory where you want to run the
   server.

2. If needed, run the ./setmyport script with two new port numbers as
   its arguments. Example:

   % ./setmyports.sh 11100 11033

   The first port is internal to the server (for its rmi), and the
   second port is the one that agents connect to.

3. Run the ./startServer.sh script. The game server will start and wait
for agents to connect.

4. Run your agents, they should connect to the game server.

5. To start the simulation, press ENTER in the server.

6. The tournament and all its simulations will be run. Each simulation
game will create a directory inside the output/ directory on the server
side where all the pictures of the simulation will be stored.

7. To watch a specific simulation open the SimulationPreview.svg file using
Internet Explorer 6 with the Adobe SVG Plugin:

http://www.adobe.com/svg/viewer/install/main.html


OBS: Note that if the server is terminated abnormally, it is likely to leave
   an rmiregistry process running, and this will cause error output upon a
   subsequent run. In such a case, you might need to kill the rmiregstry
   process manually.



===============================================================================
B. SERVER CONFIGURATION

B.1. PORT CONFIGURATION

The clima server uses several ports, two of which are pre-set while others are
allocated dynamically. The two most important ports are the RMI port and the
game port where the agents will connect to participate in the game.

The most important port is the game one. The port number to be used as the
game port is specified in the server configuration file
conf/serverconfig.xml. The RMI port is specified in the start-up script
(startServer.sh). However, to change both ports it is safer to use the script
setmyports.sh provided:

./setmyports.sh <rmiport> <gameport>

This script will do the necessary modifications to both conf/serverconfig.xml
and startServer.sh.

By detault the RMI port is 11100 and the game port is 11033. Make sure you
choose high number ports to make sure you have permissions to use those ports. 


B.2. TOURNAMENT GAME CONFIGURATION

The tournament configuration is all defined in file conf/serverconfig.xml. The
serverconfig.xml file is located inside the conf directory. There you can
specify all the parameters refered to the simulation: from the number of
agents to the map style.

The first relevant element is the configuration one. It contains attributes
like the grid's size, number of elements (agents, gold items, obstacles)
inside the grid and some probability parameters.

If no more is specified a random map will be created using the parameters
provided.

There is also the capability of creating your map, placing all the elements in
their position.
===============================================================================




===============================================================================
EOF: README.txt
===============================================================================

