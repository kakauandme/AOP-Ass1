/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.plans;
import aos.jack.jak.plan.Plan;
import aos.jack.jak.plan.PlanFSM;
import aos.jack.jak.plan.ExMap;
import aos.jack.jak.agent.NameSpace;
import aos.jack.jak.agent.Agent;
import aos.jack.jak.event.Event;
import aos.jack.jak.task.Task;
import aos.jack.jak.core.Generator;
import aos.jack.jak.logic.Signature;
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.jackagt.events.MESimEnd;
import rmit.ai.clima.iface.PerceiveClimaServer;
import rmit.ai.clima.jackagt.data.CellEmpty;
import rmit.ai.clima.jackagt.data.SimulationProp;
import rmit.ai.clima.jackagt.data.CurrentRequestActionId;
import rmit.ai.clima.interfaces.DebugInterface;
import java.lang.Object;
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.fsm.FSM;
import rmit.ai.clima.comms.SimEnd;
import aos.jack.jak.core.Jak;

public class FinishSimulation extends aos.jack.jak.plan.Plan {
    public rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_s;
    public rmit.ai.clima.jackagt.events.MESimEnd mesimend_s;
    public rmit.ai.clima.iface.PerceiveClimaServer perceiveclimaserver_h;
    public rmit.ai.clima.jackagt.data.CellEmpty bel_cellEmpty_dat;
    public rmit.ai.clima.jackagt.data.SimulationProp bel_simulationProp_dat;
    public rmit.ai.clima.jackagt.data.CurrentRequestActionId bel_currentRequestActionId_dat;
    public rmit.ai.clima.interfaces.DebugInterface debugIface;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/FinishSimulation.plan",
            "body",
            "54",
            "58",
            "59",
            "60",
            "61",
            "66",
            "67",
            "71",
            "51"};
    private final static java.lang.String[] __planVariableNames = {
            "eguidebugmessage_s",
            "mesimend_s",
            "perceiveclimaserver_h",
            "bel_cellEmpty_dat",
            "bel_simulationProp_dat",
            "bel_currentRequestActionId_dat",
            "debugIface"};
    private final static java.lang.String[] __planVariableTypes = {
            "EGUIDebugMessage",
            "MESimEnd",
            "PerceiveClimaServer",
            "rmit.ai.clima.jackagt.data.CellEmpty",
            "rmit.ai.clima.jackagt.data.SimulationProp",
            "rmit.ai.clima.jackagt.data.CurrentRequestActionId",
            "rmit.ai.clima.interfaces.DebugInterface"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "$x",
            "$y",
            "$gridX",
            "$gridY",
            "$depotX",
            "$depotY",
            "$noSteps",
            "$id",
            "$step"};
    private final static java.lang.String[] __fsmTypes_body = {
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "logical int"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__8_0",
            "__local__8_1",
            "__local__8_2",
            "__local__8_3",
            "__local__8_4",
            "__local__8_5",
            "__local__8_6",
            "__local__8_7",
            "__local__8_8"};
    static boolean relevant(rmit.ai.clima.iface.PerceiveClimaServer perceiveclimaserver_h)
    {
        return perceiveclimaserver_h.data instanceof rmit.ai.clima.comms.SimEnd;
    }
    
    public FinishSimulation()
    {
    }
    
    private FinishSimulation(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.FinishSimulation __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        eguidebugmessage_s = __env.eguidebugmessage_s;
        mesimend_s = __env.mesimend_s;
        perceiveclimaserver_h = __env.perceiveclimaserver_h;
        bel_cellEmpty_dat = __env.bel_cellEmpty_dat;
        bel_simulationProp_dat = __env.bel_simulationProp_dat;
        bel_currentRequestActionId_dat = __env.bel_currentRequestActionId_dat;
        debugIface = (rmit.ai.clima.interfaces.DebugInterface) __ns.getIF(rmit.ai.clima.interfaces.DebugInterface.class);
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        eguidebugmessage_s = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) __a.findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        if (eguidebugmessage_s == null) {
            warning("Failed to find EGUIDebugMessage eguidebugmessage_s");
            return false;
        }
        mesimend_s = (rmit.ai.clima.jackagt.events.MESimEnd) __a.findEvent("rmit.ai.clima.jackagt.events.MESimEnd");
        if (mesimend_s == null) {
            warning("Failed to find MESimEnd mesimend_s");
            return false;
        }
        perceiveclimaserver_h = (rmit.ai.clima.iface.PerceiveClimaServer) __a.findEvent("rmit.ai.clima.iface.PerceiveClimaServer");
        if (perceiveclimaserver_h == null) {
            warning("Failed to find PerceiveClimaServer perceiveclimaserver_h");
            return false;
        }
        bel_cellEmpty_dat = (rmit.ai.clima.jackagt.data.CellEmpty) lookupNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_cellEmpty_dat == null) {
            warning("Failed to find CellEmpty bel_cellEmpty_dat");
            return false;
        }
        bel_simulationProp_dat = (rmit.ai.clima.jackagt.data.SimulationProp) lookupNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_simulationProp_dat == null) {
            warning("Failed to find SimulationProp bel_simulationProp_dat");
            return false;
        }
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) lookupNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_currentRequestActionId_dat == null) {
            warning("Failed to find CurrentRequestActionId bel_currentRequestActionId_dat");
            return false;
        }
        return true;
    }
    
    public aos.jack.jak.plan.Plan freeze()
    {
        return this;
    }
    
    public aos.jack.jak.plan.Plan unfreeze()
    {
        return this;
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
    
    public aos.jack.jak.plan.PlanFSM body()
    {
        return new rmit.ai.clima.jackagt.plans.FinishSimulation.__bodyFSM();
    }
    
    private FinishSimulation(rmit.ai.clima.iface.PerceiveClimaServer __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.FinishSimulation __env)
    {
        this(__t,__env);
        this.perceiveclimaserver_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return perceiveclimaserver_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.iface.PerceiveClimaServer";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled() && relevant(((rmit.ai.clima.iface.PerceiveClimaServer) __e));
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.iface.PerceiveClimaServer)) 
            return null;
        rmit.ai.clima.iface.PerceiveClimaServer __e1 = (rmit.ai.clima.iface.PerceiveClimaServer) __e;
        return new rmit.ai.clima.jackagt.plans.FinishSimulation(__e1,__t,this);
    }
    
    public java.lang.String[] variableNames()
    {
        return __planVariableNames;
    }
    
    public java.lang.String[] variableTypes()
    {
        return __planVariableTypes;
    }
    
    public java.lang.Object getVariable(int n)
    {
        switch (n) {
            case 0: 
            {
                return aos.util.ToObject.box(eguidebugmessage_s);
            }
            case 1: 
            {
                return aos.util.ToObject.box(mesimend_s);
            }
            case 2: 
            {
                return aos.util.ToObject.box(perceiveclimaserver_h);
            }
            case 3: 
            {
                return aos.util.ToObject.box(bel_cellEmpty_dat);
            }
            case 4: 
            {
                return aos.util.ToObject.box(bel_simulationProp_dat);
            }
            case 5: 
            {
                return aos.util.ToObject.box(bel_currentRequestActionId_dat);
            }
            case 6: 
            {
                return aos.util.ToObject.box(debugIface);
            }
            default: 
            {
                throw new java.lang.IndexOutOfBoundsException("Plan " + this + " does not have variable number " + n);
            }
        }
    }
    
    public java.lang.String[] reasoningMethods()
    {
        return mergeReasoningMethods(__reasoningMethods,super.reasoningMethods());
    }
    
    public aos.jack.jak.cursor.Cursor context()
    {
        try {
            return (((true)?aos.jack.jak.cursor.Cursor.trueCursor:aos.jack.jak.cursor.Cursor.falseCursor));
        }
        catch (java.lang.Exception e) {
            e.printStackTrace();
            return aos.jack.jak.cursor.Cursor.falseCursor;
        }
    }
    
    class __bodyFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        aos.jack.jak.logic.IntegerVariable __local__8_0;
        aos.jack.jak.logic.IntegerVariable __local__8_1;
        aos.jack.jak.logic.IntegerVariable __local__8_2;
        aos.jack.jak.logic.IntegerVariable __local__8_3;
        aos.jack.jak.logic.IntegerVariable __local__8_4;
        aos.jack.jak.logic.IntegerVariable __local__8_5;
        aos.jack.jak.logic.IntegerVariable __local__8_6;
        aos.jack.jak.logic.IntegerVariable __local__8_7;
        aos.jack.jak.logic.IntegerVariable __local__8_8;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-FinishSimulation.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.FinishSimulation.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("FinishSimulation.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (54) 		debugIface.showConsoleDebug("I have received a SIM-END message....");
                        case 10: 
                        {
                            __breakLevel = 0;
                            __state = 11;
                            debugIface.showConsoleDebug("I have received a SIM-END message....");
                            break;
                        }
                        //* (58)         logical int $x,$y, $gridX, $gridY, $depotX, $depotY, $noSteps, $id, $step;
                        case 11: 
                        {
                            __local__8_0 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__8_1 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__8_2 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__8_3 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__8_4 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__8_5 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__8_6 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__8_7 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__8_8 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 12;
                            break;
                        }
                        //* (59)         bel_cellEmpty_dat.get($x,$y).removeAll();
                        case 12: 
                        {
                            __state = 13;
                            bel_cellEmpty_dat.get(__local__8_0,__local__8_1).removeAll();
                            break;
                        }
                        //* (60)         bel_simulationProp_dat.get($gridX,$gridY,$depotX,$depotY,$noSteps).removeAll();
                        case 13: 
                        {
                            __state = 14;
                            bel_simulationProp_dat.get(__local__8_2,__local__8_3,__local__8_4,__local__8_5,__local__8_6).removeAll();
                            break;
                        }
                        //* (61) 	    bel_currentRequestActionId_dat.get($id,$step).removeAll();
                        case 14: 
                        {
                            __state = 15;
                            bel_currentRequestActionId_dat.get(__local__8_7,__local__8_8).removeAll();
                            break;
                        }
                        //* (66)         @send("boss", mesimend_s.send());
                        case 15: 
                        {
                            __state = 16;
                            agent.send("boss",mesimend_s.send());
                            break;
                        }
                        //* (67)     	@send("gui", mesimend_s.send());
                        case 16: 
                        {
                            __state = 17;
                            agent.send("gui",mesimend_s.send());
                            break;
                        }
                        //* (71) 		debugIface.showConsoleDebug("I have finished the current simulation");
                        case 17: 
                        {
                            __state = 18;
                            // Report the end of the current simulation for this agent

                            debugIface.showConsoleDebug("I have finished the current simulation");
                            break;
                        }
                        //* (51)     #reasoning method
                        case 18: 
                        {
                            if (__pending == null) 
                                __state = PASSED_STATE;
                            __tothrow = __pending;
                            break;
                        }
                    }
                }
                catch (java.lang.Throwable e) {
                    handleException(e,__exMap_body);
                }
            }
             while (!agent.changing_focus);
            return CONTINUE;
        }
        
        public java.lang.String methodName()
        {
            return "body";
        }
        
        __bodyFSM()
        {
        }
        
        public java.lang.String stateInfo()
        {
            int n = __curstate;
            java.lang.String file = __tt__body[0];
            java.lang.String method = __tt__body[1];
            if (n < 0) 
                n = -n;
            n -= (10 - 2);
            java.lang.String line = (n < 2)?"??":__tt__body[n];
            return file + ":" + line + " " + method + " [" + __curstate + "]";
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
        
        public aos.jack.jak.plan.Plan getPlan()
        {
            return rmit.ai.clima.jackagt.plans.FinishSimulation.this;
        }
        
        protected aos.jack.jak.fsm.FSM fail()
        {
            return getPlan().fail();
        }
        
        protected aos.jack.jak.fsm.FSM pass()
        {
            return getPlan().pass();
        }
        
        public void enter()
        {
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.FinishSimulation.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__8_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__8_1);
                }
                case 2: 
                {
                    return aos.util.ToObject.box(__local__8_2);
                }
                case 3: 
                {
                    return aos.util.ToObject.box(__local__8_3);
                }
                case 4: 
                {
                    return aos.util.ToObject.box(__local__8_4);
                }
                case 5: 
                {
                    return aos.util.ToObject.box(__local__8_5);
                }
                case 6: 
                {
                    return aos.util.ToObject.box(__local__8_6);
                }
                case 7: 
                {
                    return aos.util.ToObject.box(__local__8_7);
                }
                case 8: 
                {
                    return aos.util.ToObject.box(__local__8_8);
                }
                default: 
                {
                    throw new java.lang.IndexOutOfBoundsException("Reasoning Method " + methodName() + " does not have variable number " + n);
                }
            }
        }
        
        public java.lang.String[] variableNames()
        {
            return __fsmVariableNames_body;
        }
        
        public java.lang.String[] variableTypes()
        {
            return __fsmTypes_body;
        }
        
        public java.lang.String[] variableLocalNames()
        {
            return __fsmLocalNames_body;
        }
        
    }
}
