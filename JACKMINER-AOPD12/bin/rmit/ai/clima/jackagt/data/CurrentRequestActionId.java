/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.data;
import aos.jack.jak.core.Jak;
import aos.jack.jak.event.EventRecipient;
import aos.jack.jak.beliefset.ClosedWorld;
import aos.jack.jak.beliefset.ClosedWorldCursor;
import aos.jack.jak.beliefset.BeliefSetCursor;
import aos.jack.jak.beliefset.Tuple;
import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.jak.beliefset.BeliefSet;
import aos.jack.jak.logic.ChoicePoint;
import aos.jack.jak.logic.Variable;
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.cursor.BeliefState;
import aos.jack.plugin.view.rt.CleanupCursor;
import rmit.ai.clima.jackagt.events.EAct;
import java.lang.Object;

public class CurrentRequestActionId extends aos.jack.jak.beliefset.ClosedWorld {
    private rmit.ai.clima.jackagt.events.EAct eact = null;
    static public rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple __hole = new rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple(true);
    public rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple[][] __tables;
    //callback function for New operation:

    public void newfact(aos.jack.jak.beliefset.Tuple t, aos.jack.jak.cursor.BeliefState is, aos.jack.jak.cursor.BeliefState was)
    {
    }
    
    //callback function for Remove operation:

    public void endfact(aos.jack.jak.beliefset.Tuple t, aos.jack.jak.cursor.BeliefState was, aos.jack.jak.cursor.BeliefState is)
    {
    }
    
    //callback function for Update operation:

    public void addfact(aos.jack.jak.beliefset.Tuple t, aos.jack.jak.cursor.BeliefState is)
    {
    }
    
    //callback function for Modify operation:

    public void modfact(aos.jack.jak.beliefset.Tuple t, aos.jack.jak.cursor.BeliefState is, aos.jack.jak.beliefset.Tuple knocked, aos.jack.jak.beliefset.Tuple negated)
    {
    }
    
    public boolean attach(aos.jack.jak.event.EventRecipient __h)
    {
        java.lang.Object __o = __h;
        if (!super.attach(__h)) 
            return false;
        eact = (rmit.ai.clima.jackagt.events.EAct) findEvent("rmit.ai.clima.jackagt.events.EAct");
        if (eact == null) {
            aos.jack.jak.core.Jak.warning("beliefset CurrentRequestActionId in " + getHandler().toString() + " discarded because it does not handle rmit.ai.clima.jackagt.events.EAct");
            return false;
        }
        return true;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor get(aos.jack.jak.logic.IntegerVariable __v0, aos.jack.jak.logic.IntegerVariable __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple();
        rmit.ai.clima.jackagt.data.CurrentRequestActionId.__Cursor __c = new rmit.ai.clima.jackagt.data.CurrentRequestActionId.__Cursor(__t);
        if (!__v0.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("CurrentRequestActionId:get:OO: arg 0 id Incorrect Variable type");
        if (__v0.isGround()) {
            try {
                __t.id = __v0.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("CurrentRequestActionId:get:OO: got " + e.toString());
            }
        }
         else 
            __c.id = __v0;
        if (!__v1.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("CurrentRequestActionId:get:OO: arg 1 step Incorrect Variable type");
        if (__v1.isGround()) {
            try {
                __t.step = __v1.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("CurrentRequestActionId:get:OO: got " + e.toString());
            }
        }
         else 
            __c.step = __v1;
        __c.init(-1,this);
        return __c;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor get_id(aos.jack.jak.logic.IntegerVariable __v0, int __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple();
        rmit.ai.clima.jackagt.data.CurrentRequestActionId.__Cursor __c = new rmit.ai.clima.jackagt.data.CurrentRequestActionId.__Cursor(__t);
        if (!__v0.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("CurrentRequestActionId:get_id:OI: arg 0 id Incorrect Variable type");
        if (__v0.isGround()) {
            try {
                __t.id = __v0.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("CurrentRequestActionId:get_id:OI: got " + e.toString());
            }
        }
         else 
            __c.id = __v0;
        __t.step = __v1;
        __c.init(1,this);
        return __c;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor get_step(int __v0, aos.jack.jak.logic.IntegerVariable __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple();
        rmit.ai.clima.jackagt.data.CurrentRequestActionId.__Cursor __c = new rmit.ai.clima.jackagt.data.CurrentRequestActionId.__Cursor(__t);
        __t.id = __v0;
        if (!__v1.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("CurrentRequestActionId:get_step:IO: arg 1 step Incorrect Variable type");
        if (__v1.isGround()) {
            try {
                __t.step = __v1.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("CurrentRequestActionId:get_step:IO: got " + e.toString());
            }
        }
         else 
            __c.step = __v1;
        __c.init(2,this);
        return __c;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor check(int __v0, int __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple();
        rmit.ai.clima.jackagt.data.CurrentRequestActionId.__Cursor __c = new rmit.ai.clima.jackagt.data.CurrentRequestActionId.__Cursor(__t);
        __t.id = __v0;
        __t.step = __v1;
        __c.init(3,this);
        return __c;
    }
    
    public aos.jack.jak.cursor.Cursor query_id(aos.jack.jak.logic.IntegerVariable $id)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentRequestActionId.__complex_4 __c = new rmit.ai.clima.jackagt.data.CurrentRequestActionId.__complex_4($id);
        try {
            return __c.setCursor(__c.__complex_4_query_id());
        }
        catch (java.lang.Exception __e) {
            throw new aos.jack.jak.beliefset.BeliefSetException("query_id got exception " + __e);
        }
    }
    
    public aos.jack.jak.cursor.Cursor query_step(aos.jack.jak.logic.IntegerVariable $step)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentRequestActionId.__complex_5 __c = new rmit.ai.clima.jackagt.data.CurrentRequestActionId.__complex_5($step);
        try {
            return __c.setCursor(__c.__complex_5_query_step());
        }
        catch (java.lang.Exception __e) {
            throw new aos.jack.jak.beliefset.BeliefSetException("query_step got exception " + __e);
        }
    }
    
    public aos.jack.jak.cursor.Cursor check_id(int id)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentRequestActionId.__complex_6 __c = new rmit.ai.clima.jackagt.data.CurrentRequestActionId.__complex_6(id);
        try {
            return __c.setCursor(__c.__complex_6_check_id());
        }
        catch (java.lang.Exception __e) {
            throw new aos.jack.jak.beliefset.BeliefSetException("check_id got exception " + __e);
        }
    }
    
    public aos.jack.jak.cursor.Cursor check_step(int step)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentRequestActionId.__complex_7 __c = new rmit.ai.clima.jackagt.data.CurrentRequestActionId.__complex_7(step);
        try {
            return __c.setCursor(__c.__complex_7_check_step());
        }
        catch (java.lang.Exception __e) {
            throw new aos.jack.jak.beliefset.BeliefSetException("check_step got exception " + __e);
        }
    }
    
    public int id()
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentRequestActionId.__complex_8 __c = new rmit.ai.clima.jackagt.data.CurrentRequestActionId.__complex_8();
        try {
            return __c.__complex_8_id();
        }
        catch (java.lang.Exception __e) {
            throw new aos.jack.jak.beliefset.BeliefSetException("id got exception " + __e);
        }
    }
    
    public int step()
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentRequestActionId.__complex_9 __c = new rmit.ai.clima.jackagt.data.CurrentRequestActionId.__complex_9();
        try {
            return __c.__complex_9_step();
        }
        catch (java.lang.Exception __e) {
            throw new aos.jack.jak.beliefset.BeliefSetException("step got exception " + __e);
        }
    }
    
    public int keyIndex()
    {
        return 0;
    }
    
    public int fullIndex()
    {
        return 3;
    }
    
    public int nIndexes()
    {
        return 4;
    }
    
    public aos.jack.jak.beliefset.Tuple newTuple()
    {
        return new rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple();
    }
    
    public aos.jack.jak.beliefset.Tuple getTuple(int t, int l)
    {
        return __tables[t][l];
    }
    
    public aos.jack.jak.beliefset.Tuple[] newTable(int t)
    {
        return new rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple[t];
    }
    
    public aos.jack.jak.beliefset.Tuple[][] newTables(int t)
    {
        return new rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple[t][];
    }
    
    public aos.jack.jak.beliefset.Tuple[] getTable(int t)
    {
        return __tables[t];
    }
    
    public aos.jack.jak.beliefset.Tuple[][] getTables()
    {
        return __tables;
    }
    
    public void setTables(aos.jack.jak.beliefset.Tuple[][] t)
    {
        __tables = (rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple[][]) t;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor newCursor(aos.jack.jak.beliefset.Tuple __t)
    {
        if (__t instanceof rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple) 
            return new rmit.ai.clima.jackagt.data.CurrentRequestActionId.__Cursor((rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple) __t);
        return null;
    }
    
    public void add(int __v0, int __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        add(__v0,__v1,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void add(int __v0, int __v1, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple();
        __t.id = __v0;
        __t.step = __v1;
        super.assertTuple(__t,__d);
    }
    
    public void remove(int __v0, int __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        remove(__v0,__v1,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void remove(int __v0, int __v1, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple();
        __t.id = __v0;
        __t.step = __v1;
        super.retractTuple(__t,__d);
    }
    
    public CurrentRequestActionId()
    {
    }
    
    public CurrentRequestActionId(java.lang.String n)
    {
        super();
        read(n);
    }
    
    class __Cursor extends aos.jack.jak.beliefset.ClosedWorldCursor {
        public rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple __tuple = null;
        public aos.jack.jak.logic.Variable id;
        public aos.jack.jak.logic.Variable step;
        public __Cursor()
        {
            __tuple = __hole;
        }
        
        public __Cursor(rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple __t)
        {
            super();
            __tuple = __t;
        }
        
        public int match(int __ti, int __st, int __c, boolean __k, int __ind)
        {
            rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple[] __tab = __tables[__ti];
            rmit.ai.clima.jackagt.data.CurrentRequestActionId__Tuple __t;
            int __sz = __tab.length;
            int __i;
            if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_DB) != 0) {
                aos.jack.jak.core.Jak.log.log("CurrentRequestActionId__Tuple:match:" + __ti + ":" + __st + ":" + __c + ":" + __k + ":" + __ind);
                aos.jack.jak.core.Jak.log.log("Tuple=" + __tuple);
                aos.jack.jak.core.Jak.log.log("Outputs are");
                aos.jack.jak.core.Jak.log.log("  id:" + id);
                aos.jack.jak.core.Jak.log.log("  step:" + step);
            }
            for (__i = __st; __c > 0; __i = (__i + 1) % __sz, __c-- ) {
                __t = __tab[__i];
                if (__t == null) {
                    if (__ind < 0) 
                        continue;
                    return -1;
                }
                if (__t == __hole) 
                    continue;
                if (__t.isFree) {
                    __tab[__i] = __hole;
                    continue;
                }
                if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_DB) != 0) 
                    aos.jack.jak.core.Jak.log.log("t" + __i + ":" + __t);
                try {
                    if (cp != null) 
                        cp.backtrack();
                    if (__k) 
                        return __i;
                    if (id == null) {
                        if (__tuple.id != __t.id) 
                            continue;
                    }
                     else {
                        if (!id.unify(__t.id)) 
                            continue;
                    }
                    if (step == null) {
                        if (__tuple.step != __t.step) 
                            continue;
                    }
                     else {
                        if (!step.unify(__t.step)) 
                            continue;
                    }
                }
                catch (java.lang.Exception e) {
                    continue;
                }
                return __i;
            }
            return -1;
        }
        
        public int hash(int __i)
        {
            return (__tuple == null?0:__tuple.hash(__i));
        }
        
        public aos.jack.jak.logic.ChoicePoint getChoicePoint()
        {
            if (id != null) 
                return id.getEnv().newChoicePoint();
            if (step != null) 
                return step.getEnv().newChoicePoint();
            return null;
        }
        
        public boolean isKeyGround()
        {
            return true;
        }
        
    }
    class __complex_4 extends aos.jack.plugin.view.rt.CleanupCursor {
        aos.jack.jak.logic.IntegerVariable $id;
        aos.jack.jak.logic.IntegerVariable __local_2;
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
                    return (get($id,__local_2));
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
        
        public __complex_4(aos.jack.jak.logic.IntegerVariable $id)
        {
            super($id);
            this.$id = $id;
        }
        
        aos.jack.jak.cursor.Cursor __complex_4_query_id()
            throws java.lang.Exception
        {
            __local_2 = (aos.jack.jak.logic.IntegerVariable) new_variable(java.lang.Integer.TYPE);
            return genCursor(0);
        }
        
    }
    class __complex_5 extends aos.jack.plugin.view.rt.CleanupCursor {
        aos.jack.jak.logic.IntegerVariable $step;
        aos.jack.jak.logic.IntegerVariable __local_2;
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
                    return (get(__local_2,$step));
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
        
        public __complex_5(aos.jack.jak.logic.IntegerVariable $step)
        {
            super($step);
            this.$step = $step;
        }
        
        aos.jack.jak.cursor.Cursor __complex_5_query_step()
            throws java.lang.Exception
        {
            __local_2 = (aos.jack.jak.logic.IntegerVariable) new_variable(java.lang.Integer.TYPE);
            return genCursor(0);
        }
        
    }
    class __complex_6 extends aos.jack.plugin.view.rt.CleanupCursor {
        int id;
        aos.jack.jak.logic.IntegerVariable __local_2;
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
                    return (get_step(id,__local_2));
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
        
        public __complex_6(int id)
        {
            super();
            this.id = id;
        }
        
        aos.jack.jak.cursor.Cursor __complex_6_check_id()
            throws java.lang.Exception
        {
            __local_2 = (aos.jack.jak.logic.IntegerVariable) new_variable(java.lang.Integer.TYPE);
            return genCursor(0);
        }
        
    }
    class __complex_7 extends aos.jack.plugin.view.rt.CleanupCursor {
        int step;
        aos.jack.jak.logic.IntegerVariable __local_2;
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
                    return (get_id(__local_2,step));
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
        
        public __complex_7(int step)
        {
            super();
            this.step = step;
        }
        
        aos.jack.jak.cursor.Cursor __complex_7_check_step()
            throws java.lang.Exception
        {
            __local_2 = (aos.jack.jak.logic.IntegerVariable) new_variable(java.lang.Integer.TYPE);
            return genCursor(0);
        }
        
    }
    class __complex_8 extends aos.jack.plugin.view.rt.CleanupCursor {
        aos.jack.jak.logic.IntegerVariable __local_2;
        aos.jack.jak.logic.IntegerVariable __local_3;
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
                    return (query_id(__local_2));
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
        
        public __complex_8()
        {
            super();
        }
        
        public int __complex_8_id()
            throws java.lang.Exception
        {
            {
                __local_2 = (aos.jack.jak.logic.IntegerVariable) new_variable(java.lang.Integer.TYPE);
                __local_3 = (aos.jack.jak.logic.IntegerVariable) new_variable(java.lang.Integer.TYPE);
            }
            genCursor(0);
            return __local_2.as_int();
        }
        
    }
    class __complex_9 extends aos.jack.plugin.view.rt.CleanupCursor {
        aos.jack.jak.logic.IntegerVariable __local_2;
        aos.jack.jak.logic.IntegerVariable __local_3;
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
                    return (query_step(__local_3));
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
        
        public __complex_9()
        {
            super();
        }
        
        public int __complex_9_step()
            throws java.lang.Exception
        {
            {
                __local_2 = (aos.jack.jak.logic.IntegerVariable) new_variable(java.lang.Integer.TYPE);
                __local_3 = (aos.jack.jak.logic.IntegerVariable) new_variable(java.lang.Integer.TYPE);
            }
            genCursor(0);
            return __local_3.as_int();
        }
        
    }
}
