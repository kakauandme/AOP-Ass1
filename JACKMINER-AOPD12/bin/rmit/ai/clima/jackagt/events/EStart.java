/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.events;
import aos.jack.jak.event.BDIGoalEvent;
import aos.jack.jak.event.Event;
import aos.jack.jak.logic.LogicException;
import aos.jack.jak.logic.LogicEnv;
import aos.extension.rule.RuleMonitor;
import aos.jack.util.cursor.Change;
import java.util.Observable;
import java.lang.Object;
import aos.jack.jak.core.Jak;

/******** Start PDT Design Block *** DO NOT EDIT IT *********/

public class EStart extends aos.jack.jak.event.BDIGoalEvent implements aos.extension.rule.RuleHandler {
    public aos.jack.jak.logic.LogicEnv __logic = null;
    private final static java.lang.String[] __eventVariableNames = {
        };
    private final static java.lang.String[] __eventVariableTypes = {
        };
    private boolean __rule_init = false;
    public java.lang.String getDocumentation()
    {
        return "/******** Start PDT Design Block *** DO NOT EDIT IT *********/\n";
    }
    
    public java.lang.Object genObject(int __index)
    {
        switch (__index) {
        }
        aos.jack.jak.core.Jak.error("illegal Object Construction");
        return null;
    }
    
    public aos.jack.jak.cursor.Cursor genCursor(int __index)
        throws java.lang.Exception
    {
        switch (__index) {
            case 0: 
            {
                return (new aos.jack.util.cursor.Change(new java.util.Observable(),true));
            }
        }
        aos.jack.jak.core.Jak.error("illegal Cursor Construction");
        return null;
    }
    
    public aos.jack.jak.fsm.FSM genFSM(int __index)
        throws java.lang.Exception
    {
        switch (__index) {
        }
        aos.jack.jak.core.Jak.error("illegal FSM Construction");
        return null;
    }
    
    public boolean testCondition(int __index)
        throws java.lang.Exception
    {
        switch (__index) {
        }
        aos.jack.jak.core.Jak.error("illegal test Construction");
        return false;
    }
    
    public aos.jack.jak.event.Event __auto_post(int __index)
        throws aos.jack.jak.logic.LogicException
    {
        rmit.ai.clima.jackagt.events.EStart __tmp = new rmit.ai.clima.jackagt.events.EStart();
        __tmp.__automatic(this,__index);
        agent.postEvent(__tmp);
        return __tmp;
    }
    
    public void backtrack()
    {
        __logic.clear();
    }
    
    public EStart()
    {
    }
    
    public java.lang.String stateInfo()
    {
        return "rmit/ai/clima/jackagt/events/EStart.event [" + super.stateInfo() + "]";
    }
    
    public java.lang.String[] variableNames()
    {
        return __eventVariableNames;
    }
    
    public java.lang.String[] variableTypes()
    {
        return __eventVariableTypes;
    }
    
    public java.lang.Object getVariable(int n)
    {
        switch (n) {
            default: 
            {
                throw new java.lang.IndexOutOfBoundsException("Event " + this + " does not have variable number " + n);
            }
        }
    }
    
    public void addRelevant(aos.jack.jak.plan.Plan __p)
    {
        super.addRelevant(__p);
        if (__rule_init) 
            return ;
        __rule_init = true;
        try {
            __automatic(null,-1);
        }
        catch (aos.jack.jak.logic.LogicException e) {
        }
        new aos.extension.rule.RuleMonitor(this,0);
    }
    
    public void __automatic(rmit.ai.clima.jackagt.events.EStart __e, int __index)
        throws aos.jack.jak.logic.LogicException
    {
        __logic = new aos.jack.jak.logic.LogicEnv();
        if (__e == null) 
            return ;
        init(__e);
        switch (__index) {
        }
    }
    
}
