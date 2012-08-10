/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.agents;
import aos.jack.jak.agent.Agent;
import rmit.ai.clima.interfaces.ExternalAgent;
import rmit.ai.clima.jackagt.events.MEInformCellStatus;
import rmit.ai.clima.jackagt.events.MESimStart;
import rmit.ai.clima.jackagt.events.MEInformAgentStatus;
import rmit.ai.clima.jackagt.events.MESimEnd;
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.jackagt.capabilities.GUIUpdateCapability;
import rmit.ai.clima.gui.GuiInterface;

public class GUIAgent extends aos.jack.jak.agent.Agent implements rmit.ai.clima.interfaces.ExternalAgent {
    public rmit.ai.clima.gui.GuiInterface guiInterface;
    public boolean guiReady = false;
    public int maxAgents;
    public int stepsPerSave;
    public boolean showGUI;
    public rmit.ai.clima.jackagt.capabilities.GUIUpdateCapability guiupdatecapability_cap;
    /* Constructor */

    public GUIAgent(java.lang.String name, boolean review, boolean showGUI, int maxAgents, int stepsPerSave)
    {
        super(name);
        boolean __b = getAgentType() == rmit.ai.clima.jackagt.agents.GUIAgent.class;
        if (__b) {
            __init1();
            __init2();
        }
        guiReady = false;
        this.maxAgents = maxAgents;
        this.stepsPerSave = stepsPerSave;
        this.showGUI = showGUI;
        if (__b) 
            startAgent();
    }
    
    public void reset()
    {
        if (showGUI) {
        }
        guiReady = false;
    }
    
    /**
       * This is the method called by the GUI interface to report a message to agentNo
       * The GUI can decide what to do with this message, for example pass it to the 
       * corresponding agent
       */

    public void sendAgentMessage(int agentNo, java.lang.String message)
    {
        java.lang.System.out.println("There was a message for agent number " + agentNo + " -- Message: " + message);
    }
    
    public java.lang.Class getAgentType()
    {
        return rmit.ai.clima.jackagt.agents.GUIAgent.class;
    }
    
    public void __init1()
    {
        super.__init1();
        if (guiupdatecapability_cap == null) {
            guiupdatecapability_cap = new rmit.ai.clima.jackagt.capabilities.GUIUpdateCapability(this);
            guiupdatecapability_cap.__initCapability(this,"guiupdatecapability_cap");
        }
        guiupdatecapability_cap.__init1();
    }
    
    public void __init2()
    {
        super.__init2();
        guiupdatecapability_cap.__init2();
    }
    
    synchronized private void __init_desc()
    {
        guiupdatecapability_cap = new rmit.ai.clima.jackagt.capabilities.GUIUpdateCapability(this);
        guiupdatecapability_cap.__initCapability(this,"guiupdatecapability_cap");
        guiupdatecapability_cap.init_desc();
        addEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MESimStart",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MESimEnd",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage",aos.jack.jak.agent.Agent.HANDLED_EVENT);
    }
    
    public void init_desc()
    {
        newAgentDesc("GUIAgent");
        super.init_desc();
        __init_desc();
    }
    
    synchronized public void __bindNames()
    {
        super.__bindNames();
        guiupdatecapability_cap.__bindNames();
    }
    
    public void setEnabled(boolean t)
    {
        super.setEnabled(t);
        guiupdatecapability_cap.setEnabled(t);
    }
    
}
