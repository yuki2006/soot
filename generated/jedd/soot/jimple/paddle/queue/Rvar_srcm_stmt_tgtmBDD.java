package soot.jimple.paddle.queue;

import soot.util.*;
import soot.jimple.paddle.bdddomains.*;
import soot.jimple.paddle.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public final class Rvar_srcm_stmt_tgtmBDD extends Rvar_srcm_stmt_tgtm {
    private final jedd.internal.RelationContainer bdd =
      new jedd.internal.RelationContainer(new Attribute[] { var.v(), srcm.v(), stmt.v(), tgtm.v() },
                                          new PhysicalDomain[] { V1.v(), MS.v(), ST.v(), MT.v() },
                                          ("private <soot.jimple.paddle.bdddomains.var:soot.jimple.paddl" +
                                           "e.bdddomains.V1, soot.jimple.paddle.bdddomains.srcm:soot.jim" +
                                           "ple.paddle.bdddomains.MS, soot.jimple.paddle.bdddomains.stmt" +
                                           ":soot.jimple.paddle.bdddomains.ST, soot.jimple.paddle.bdddom" +
                                           "ains.tgtm:soot.jimple.paddle.bdddomains.MT> bdd at /home/res" +
                                           "earch/ccl/olhota/soot-trunk2/src/soot/jimple/paddle/queue/Rv" +
                                           "ar_srcm_stmt_tgtmBDD.jedd:31,12-47"));
    
    void add(final jedd.internal.RelationContainer tuple) { bdd.eqUnion(tuple); }
    
    public Rvar_srcm_stmt_tgtmBDD(final jedd.internal.RelationContainer bdd, String name) {
        this(name);
        this.add(new jedd.internal.RelationContainer(new Attribute[] { stmt.v(), tgtm.v(), var.v(), srcm.v() },
                                                     new PhysicalDomain[] { ST.v(), MT.v(), V1.v(), MS.v() },
                                                     ("this.add(bdd) at /home/research/ccl/olhota/soot-trunk2/src/s" +
                                                      "oot/jimple/paddle/queue/Rvar_srcm_stmt_tgtmBDD.jedd:33,104-1" +
                                                      "07"),
                                                     bdd));
    }
    
    Rvar_srcm_stmt_tgtmBDD(String name) {
        super(name);
        bdd.eq(jedd.internal.Jedd.v().falseBDD());
    }
    
    public Iterator iterator() {
        ;
        return new Iterator() {
            private Iterator it;
            
            public boolean hasNext() {
                if (it != null && it.hasNext()) return true;
                if (!jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(bdd), jedd.internal.Jedd.v().falseBDD()))
                    return true;
                return false;
            }
            
            public Object next() {
                if (it == null || !it.hasNext()) {
                    it =
                      new jedd.internal.RelationContainer(new Attribute[] { stmt.v(), tgtm.v(), var.v(), srcm.v() },
                                                          new PhysicalDomain[] { ST.v(), MT.v(), V1.v(), MS.v() },
                                                          ("bdd.iterator(new jedd.Attribute[...]) at /home/research/ccl/" +
                                                           "olhota/soot-trunk2/src/soot/jimple/paddle/queue/Rvar_srcm_st" +
                                                           "mt_tgtmBDD.jedd:45,25-28"),
                                                          bdd).iterator(new Attribute[] { var.v(), srcm.v(), stmt.v(), tgtm.v() });
                    bdd.eq(jedd.internal.Jedd.v().falseBDD());
                }
                Object[] components = (Object[]) it.next();
                return new Tuple((VarNode) components[0],
                                 (SootMethod) components[1],
                                 (Unit) components[2],
                                 (SootMethod) components[3]);
            }
            
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }
    
    public jedd.internal.RelationContainer get() {
        final jedd.internal.RelationContainer ret =
          new jedd.internal.RelationContainer(new Attribute[] { var.v(), srcm.v(), stmt.v(), tgtm.v() },
                                              new PhysicalDomain[] { V1.v(), MS.v(), ST.v(), MT.v() },
                                              ("<soot.jimple.paddle.bdddomains.var:soot.jimple.paddle.bdddom" +
                                               "ains.V1, soot.jimple.paddle.bdddomains.srcm:soot.jimple.padd" +
                                               "le.bdddomains.MS, soot.jimple.paddle.bdddomains.stmt:soot.ji" +
                                               "mple.paddle.bdddomains.ST, soot.jimple.paddle.bdddomains.tgt" +
                                               "m:soot.jimple.paddle.bdddomains.MT> ret = bdd; at /home/rese" +
                                               "arch/ccl/olhota/soot-trunk2/src/soot/jimple/paddle/queue/Rva" +
                                               "r_srcm_stmt_tgtmBDD.jedd:55,44-47"),
                                              bdd);
        bdd.eq(jedd.internal.Jedd.v().falseBDD());
        return new jedd.internal.RelationContainer(new Attribute[] { stmt.v(), tgtm.v(), var.v(), srcm.v() },
                                                   new PhysicalDomain[] { ST.v(), MT.v(), V1.v(), MS.v() },
                                                   ("return ret; at /home/research/ccl/olhota/soot-trunk2/src/soo" +
                                                    "t/jimple/paddle/queue/Rvar_srcm_stmt_tgtmBDD.jedd:57,8-14"),
                                                   ret);
    }
    
    public boolean hasNext() {
        return !jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(bdd), jedd.internal.Jedd.v().falseBDD());
    }
}