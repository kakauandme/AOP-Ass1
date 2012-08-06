%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Instructions to run the Agent GOLD Mining JACK agent system
%
% Sebastian Sardina (ssardina@cs.rmit.edu.au)
% July 2008
% Revised November 2009
% Revised June 2010
% Revised July 2011
% Revised July 2012
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

To run the JACK miner agent system follow these steps:

1) Make sure Java JDK 1.6 (java and javac) installed. It is
strongly recommended to use the official Java JDK from SUN. Other
implementations of Java may not work, especially for compiling the
application.

2) Make sure the following JAR files (or symbolic links to them) 
   are all in the lib/ directory:
   	jack.jar 	   	The JACK Kernel (requires Java >1.5)
	climacomms.jar	The ClimaTalking capability (requires Java >1.5)
	gui.jar	   		The GUI interface (requires Java >1.6)
	
	You can get all these files from the course web page.

3) If needed, configure the run-team.sh script to set:

   a) the login and password of each player agent by adjusting
      variables USER_N and PASSWORD_N
   b) the host and port of the CLIMA game server by adjusting
      variables HOST and PORT

4) Make sure the game sever is running

5) Run script run-team.sh to start your application. All
the agents should connect to the game server and you should see
that in the console.

There are three options that can be passwed to the script by using
-D<option name>=<value>:

  debug		true/false	print out debug info in console (default: false)
  gui		true/false	show GUI window (default: true)

For example, if one wants to turn on debugging and do not show the GUI windows, one should run:
     
     ./run-team.sh -Ddebug=true -Dgui=false

6) The simulation starts when ENTER is hit in the game server, enjoy!


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% EOF
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
