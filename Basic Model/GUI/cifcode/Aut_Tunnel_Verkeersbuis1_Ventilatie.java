package cifcode;

import static cifcode.AlgVars.*;
import static cifcode.Constants.*;
import static cifcode.Derivatives.*;
import static cifcode.Spec.MONITOR_EDGE;
import static cifcode.Spec.SPEC;
import static nl.tue.app.framework.output.OutputProvider.warn;
import static nl.tue.cif.v3x0x0.simulator.runtime.CifSimulatorMath.*;
import static nl.tue.cif.v3x0x0.simulator.runtime.io.RuntimeValueToString.runtimeToString;
import static nl.tue.common.java.ArrayUtils.array;
import static nl.tue.common.java.Lists.list;
import static nl.tue.common.java.Lists.listc;
import static nl.tue.common.java.Maps.mapc;
import static nl.tue.common.java.Sets.set;
import static nl.tue.common.java.Strings.fmt;

import java.util.*;
import java.util.Map.Entry;

import nl.tue.app.framework.exceptions.InputOutputException;
import nl.tue.app.framework.exceptions.UnsupportedException;
import nl.tue.cif.v3x0x0.simulator.input.*;
import nl.tue.cif.v3x0x0.simulator.output.print.*;
import nl.tue.cif.v3x0x0.simulator.output.svgviz.*;
import nl.tue.cif.v3x0x0.simulator.runtime.*;
import nl.tue.cif.v3x0x0.simulator.runtime.distributions.*;
import nl.tue.cif.v3x0x0.simulator.runtime.io.*;
import nl.tue.cif.v3x0x0.simulator.runtime.meta.*;
import nl.tue.cif.v3x0x0.simulator.runtime.model.*;
import nl.tue.cif.v3x0x0.simulator.runtime.ode.*;
import nl.tue.cif.v3x0x0.simulator.runtime.transitions.*;
import nl.tue.common.java.Assert;
import nl.tue.common.java.Lists;
import nl.tue.common.java.Sets;
import nl.tue.common.svg.SvgUtils;

import org.apache.commons.lang.StringUtils;

/** Automaton "Tunnel_Verkeersbuis1_Ventilatie". */
public final class Aut_Tunnel_Verkeersbuis1_Ventilatie extends RuntimeAutomaton<State> {

    @Override
    public String getName() {
        return "Tunnel_Verkeersbuis1_Ventilatie";
    }

    @Override
    public int getLocCount() {
        return 1;
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie);
    }

    @Override
    public String getLocName(int locIdx) {
        switch (locIdx) {
            case 0: return "*";
            default: throw new RuntimeException("Invalid loc idx: " + locIdx);
        }
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Ventilatie_c_0(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(615).get(2);
        rslt.clear();

        switch (state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Ventilatie_c_1(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(616).get(2);
        rslt.clear();

        switch (state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie) {
            case 0:
                if (sync0_1_0.evalGuards(state)) rslt.add(sync0_1_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Ventilatie_c_2(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(617).get(2);
        rslt.clear();

        switch (state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie) {
            case 0:
                if (sync0_2_0.evalGuards(state)) rslt.add(sync0_2_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Ventilatie_c_3(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(618).get(2);
        rslt.clear();

        switch (state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie) {
            case 0:
                if (sync0_3_0.evalGuards(state)) rslt.add(sync0_3_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Ventilatie_c_4(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(619).get(2);
        rslt.clear();

        switch (state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie) {
            case 0:
                if (sync0_4_0.evalGuards(state)) rslt.add(sync0_4_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Ventilatie_c_5(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(620).get(2);
        rslt.clear();

        switch (state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie) {
            case 0:
                if (sync0_5_0.evalGuards(state)) rslt.add(sync0_5_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Ventilatie_c_6(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(621).get(2);
        rslt.clear();

        switch (state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie) {
            case 0:
                if (sync0_6_0.evalGuards(state)) rslt.add(sync0_6_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Ventilatie_c_7(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(622).get(2);
        rslt.clear();

        switch (state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie) {
            case 0:
                if (sync0_7_0.evalGuards(state)) rslt.add(sync0_7_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Ventilatie_c_8(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(623).get(2);
        rslt.clear();

        switch (state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie) {
            case 0:
                if (sync0_8_0.evalGuards(state)) rslt.add(sync0_8_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        List<RuntimeEdge<State>> edgeData;
        switch (state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie) {
        }
    }

    private static final Sync0_0_0 sync0_0_0 = new Sync0_0_0();

    private static final class Sync0_0_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = !(equal(state.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5, 0));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"not(Tunnel_Verkeersbuis1_Ventilatie.stand = 0)\" of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            boolean b; // temp var for pred eval rslts
            target.s_Tunnel_Verkeersbuis1_Ventilatie = source.s_Tunnel_Verkeersbuis1_Ventilatie.copy();
            try {
                try {
                    target.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5 = 0;
                } catch (CifSimulatorException e) {
                    throw new CifSimulatorException("Execution of assignment \"Tunnel_Verkeersbuis1_Ventilatie.stand := 0\" failed.", e, source);
                }
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Execution of the updates of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, source);
            }
        }
    }

    private static final Sync0_1_0 sync0_1_0 = new Sync0_1_0();

    private static final class Sync0_1_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = !(equal(state.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5, 1));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"not(Tunnel_Verkeersbuis1_Ventilatie.stand = 1)\" of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            boolean b; // temp var for pred eval rslts
            target.s_Tunnel_Verkeersbuis1_Ventilatie = source.s_Tunnel_Verkeersbuis1_Ventilatie.copy();
            try {
                try {
                    target.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5 = 1;
                } catch (CifSimulatorException e) {
                    throw new CifSimulatorException("Execution of assignment \"Tunnel_Verkeersbuis1_Ventilatie.stand := 1\" failed.", e, source);
                }
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Execution of the updates of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, source);
            }
        }
    }

    private static final Sync0_2_0 sync0_2_0 = new Sync0_2_0();

    private static final class Sync0_2_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = !(equal(state.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5, 2));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"not(Tunnel_Verkeersbuis1_Ventilatie.stand = 2)\" of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            boolean b; // temp var for pred eval rslts
            target.s_Tunnel_Verkeersbuis1_Ventilatie = source.s_Tunnel_Verkeersbuis1_Ventilatie.copy();
            try {
                try {
                    target.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5 = 2;
                } catch (CifSimulatorException e) {
                    throw new CifSimulatorException("Execution of assignment \"Tunnel_Verkeersbuis1_Ventilatie.stand := 2\" failed.", e, source);
                }
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Execution of the updates of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, source);
            }
        }
    }

    private static final Sync0_3_0 sync0_3_0 = new Sync0_3_0();

    private static final class Sync0_3_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = !(equal(state.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5, 3));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"not(Tunnel_Verkeersbuis1_Ventilatie.stand = 3)\" of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            boolean b; // temp var for pred eval rslts
            target.s_Tunnel_Verkeersbuis1_Ventilatie = source.s_Tunnel_Verkeersbuis1_Ventilatie.copy();
            try {
                try {
                    target.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5 = 3;
                } catch (CifSimulatorException e) {
                    throw new CifSimulatorException("Execution of assignment \"Tunnel_Verkeersbuis1_Ventilatie.stand := 3\" failed.", e, source);
                }
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Execution of the updates of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, source);
            }
        }
    }

    private static final Sync0_4_0 sync0_4_0 = new Sync0_4_0();

    private static final class Sync0_4_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = !(equal(state.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5, 4));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"not(Tunnel_Verkeersbuis1_Ventilatie.stand = 4)\" of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            boolean b; // temp var for pred eval rslts
            target.s_Tunnel_Verkeersbuis1_Ventilatie = source.s_Tunnel_Verkeersbuis1_Ventilatie.copy();
            try {
                try {
                    target.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5 = 4;
                } catch (CifSimulatorException e) {
                    throw new CifSimulatorException("Execution of assignment \"Tunnel_Verkeersbuis1_Ventilatie.stand := 4\" failed.", e, source);
                }
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Execution of the updates of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, source);
            }
        }
    }

    private static final Sync0_5_0 sync0_5_0 = new Sync0_5_0();

    private static final class Sync0_5_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = !(equal(state.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5, 5));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"not(Tunnel_Verkeersbuis1_Ventilatie.stand = 5)\" of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            boolean b; // temp var for pred eval rslts
            target.s_Tunnel_Verkeersbuis1_Ventilatie = source.s_Tunnel_Verkeersbuis1_Ventilatie.copy();
            try {
                try {
                    target.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5 = 5;
                } catch (CifSimulatorException e) {
                    throw new CifSimulatorException("Execution of assignment \"Tunnel_Verkeersbuis1_Ventilatie.stand := 5\" failed.", e, source);
                }
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Execution of the updates of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, source);
            }
        }
    }

    private static final Sync0_6_0 sync0_6_0 = new Sync0_6_0();

    private static final class Sync0_6_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = !(equal(state.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5, 6));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"not(Tunnel_Verkeersbuis1_Ventilatie.stand = 6)\" of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            boolean b; // temp var for pred eval rslts
            target.s_Tunnel_Verkeersbuis1_Ventilatie = source.s_Tunnel_Verkeersbuis1_Ventilatie.copy();
            try {
                try {
                    target.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5 = 6;
                } catch (CifSimulatorException e) {
                    throw new CifSimulatorException("Execution of assignment \"Tunnel_Verkeersbuis1_Ventilatie.stand := 6\" failed.", e, source);
                }
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Execution of the updates of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, source);
            }
        }
    }

    private static final Sync0_7_0 sync0_7_0 = new Sync0_7_0();

    private static final class Sync0_7_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = !(equal(state.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5, 7));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"not(Tunnel_Verkeersbuis1_Ventilatie.stand = 7)\" of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            boolean b; // temp var for pred eval rslts
            target.s_Tunnel_Verkeersbuis1_Ventilatie = source.s_Tunnel_Verkeersbuis1_Ventilatie.copy();
            try {
                try {
                    target.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5 = 7;
                } catch (CifSimulatorException e) {
                    throw new CifSimulatorException("Execution of assignment \"Tunnel_Verkeersbuis1_Ventilatie.stand := 7\" failed.", e, source);
                }
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Execution of the updates of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, source);
            }
        }
    }

    private static final Sync0_8_0 sync0_8_0 = new Sync0_8_0();

    private static final class Sync0_8_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = !(equal(state.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5, 8));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"not(Tunnel_Verkeersbuis1_Ventilatie.stand = 8)\" of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            boolean b; // temp var for pred eval rslts
            target.s_Tunnel_Verkeersbuis1_Ventilatie = source.s_Tunnel_Verkeersbuis1_Ventilatie.copy();
            try {
                try {
                    target.s_Tunnel_Verkeersbuis1_Ventilatie.v_stand5 = 8;
                } catch (CifSimulatorException e) {
                    throw new CifSimulatorException("Execution of assignment \"Tunnel_Verkeersbuis1_Ventilatie.stand := 8\" failed.", e, source);
                }
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Execution of the updates of an edge of the location of automaton \"Tunnel_Verkeersbuis1_Ventilatie\" failed.", e, source);
            }
        }
    }
}
