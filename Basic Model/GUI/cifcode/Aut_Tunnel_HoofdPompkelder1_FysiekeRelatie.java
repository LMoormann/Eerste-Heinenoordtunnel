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

/** Automaton "Tunnel_HoofdPompkelder1_FysiekeRelatie". */
public final class Aut_Tunnel_HoofdPompkelder1_FysiekeRelatie extends RuntimeAutomaton<State> {

    @Override
    public String getName() {
        return "Tunnel_HoofdPompkelder1_FysiekeRelatie";
    }

    @Override
    public int getLocCount() {
        return 1;
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie);
    }

    @Override
    public String getLocName(int locIdx) {
        switch (locIdx) {
            case 0: return "*";
            default: throw new RuntimeException("Invalid loc idx: " + locIdx);
        }
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorHooghoogwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(204).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie) {
            case 0:
                if (sync0_8_0.evalGuards(state)) rslt.add(sync0_8_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorHooghoogwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(205).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie) {
            case 0:
                if (sync0_4_0.evalGuards(state)) rslt.add(sync0_4_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorLaaghoogwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(206).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie) {
            case 0:
                if (sync0_7_0.evalGuards(state)) rslt.add(sync0_7_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorLaaghoogwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(207).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie) {
            case 0:
                if (sync0_3_0.evalGuards(state)) rslt.add(sync0_3_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorLaagwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(209).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorMaxstartwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(210).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie) {
            case 0:
                if (sync0_6_0.evalGuards(state)) rslt.add(sync0_6_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorMaxstartwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(211).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie) {
            case 0:
                if (sync0_2_0.evalGuards(state)) rslt.add(sync0_2_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorStartwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(212).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie) {
            case 0:
                if (sync0_5_0.evalGuards(state)) rslt.add(sync0_5_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorStartwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(213).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie) {
            case 0:
                if (sync0_1_0.evalGuards(state)) rslt.add(sync0_1_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        List<RuntimeEdge<State>> edgeData;
        switch (state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie) {
        }
    }

    private static final Sync0_0_0 sync0_0_0 = new Sync0_0_0();

    private static final class Sync0_0_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = (state.s_Tunnel_HoofdPompkelder1_SensorStartwater.lp_Tunnel_HoofdPompkelder1_SensorStartwater == 0) && ((state.s_Tunnel_HoofdPompkelder1_Pomp1.lp_Tunnel_HoofdPompkelder1_Pomp1 == 1) || (state.s_Tunnel_HoofdPompkelder1_Pomp2.lp_Tunnel_HoofdPompkelder1_Pomp2 == 1));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder1_SensorStartwater.uit and (Tunnel_HoofdPompkelder1_Pomp1.aan or Tunnel_HoofdPompkelder1_Pomp2.aan)\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder1_FysiekeRelatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_1_0 sync0_1_0 = new Sync0_1_0();

    private static final class Sync0_1_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = (state.s_Tunnel_HoofdPompkelder1_SensorMaxstartwater.lp_Tunnel_HoofdPompkelder1_SensorMaxstartwater == 0) && ((state.s_Tunnel_HoofdPompkelder1_Pomp1.lp_Tunnel_HoofdPompkelder1_Pomp1 == 1) || (state.s_Tunnel_HoofdPompkelder1_Pomp2.lp_Tunnel_HoofdPompkelder1_Pomp2 == 1));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder1_SensorMaxstartwater.uit and (Tunnel_HoofdPompkelder1_Pomp1.aan or Tunnel_HoofdPompkelder1_Pomp2.aan)\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder1_FysiekeRelatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_2_0 sync0_2_0 = new Sync0_2_0();

    private static final class Sync0_2_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = (state.s_Tunnel_HoofdPompkelder1_SensorLaaghoogwater.lp_Tunnel_HoofdPompkelder1_SensorLaaghoogwater == 0) && ((state.s_Tunnel_HoofdPompkelder1_Pomp1.lp_Tunnel_HoofdPompkelder1_Pomp1 == 1) || (state.s_Tunnel_HoofdPompkelder1_Pomp2.lp_Tunnel_HoofdPompkelder1_Pomp2 == 1));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder1_SensorLaaghoogwater.uit and (Tunnel_HoofdPompkelder1_Pomp1.aan or Tunnel_HoofdPompkelder1_Pomp2.aan)\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder1_FysiekeRelatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_3_0 sync0_3_0 = new Sync0_3_0();

    private static final class Sync0_3_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = (state.s_Tunnel_HoofdPompkelder1_SensorHooghoogwater.lp_Tunnel_HoofdPompkelder1_SensorHooghoogwater == 0) && ((state.s_Tunnel_HoofdPompkelder1_Pomp1.lp_Tunnel_HoofdPompkelder1_Pomp1 == 1) || (state.s_Tunnel_HoofdPompkelder1_Pomp2.lp_Tunnel_HoofdPompkelder1_Pomp2 == 1));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder1_SensorHooghoogwater.uit and (Tunnel_HoofdPompkelder1_Pomp1.aan or Tunnel_HoofdPompkelder1_Pomp2.aan)\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder1_FysiekeRelatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_4_0 sync0_4_0 = new Sync0_4_0();

    private static final class Sync0_4_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = (state.s_Tunnel_HoofdPompkelder1_Pomp1.lp_Tunnel_HoofdPompkelder1_Pomp1 == 1) || (state.s_Tunnel_HoofdPompkelder1_Pomp2.lp_Tunnel_HoofdPompkelder1_Pomp2 == 1);
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder1_Pomp1.aan or Tunnel_HoofdPompkelder1_Pomp2.aan\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder1_FysiekeRelatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_5_0 sync0_5_0 = new Sync0_5_0();

    private static final class Sync0_5_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = state.s_Tunnel_HoofdPompkelder1_SensorLaagwater.lp_Tunnel_HoofdPompkelder1_SensorLaagwater == 1;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder1_SensorLaagwater.aan\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder1_FysiekeRelatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_6_0 sync0_6_0 = new Sync0_6_0();

    private static final class Sync0_6_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = state.s_Tunnel_HoofdPompkelder1_SensorStartwater.lp_Tunnel_HoofdPompkelder1_SensorStartwater == 1;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder1_SensorStartwater.aan\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder1_FysiekeRelatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_7_0 sync0_7_0 = new Sync0_7_0();

    private static final class Sync0_7_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = state.s_Tunnel_HoofdPompkelder1_SensorMaxstartwater.lp_Tunnel_HoofdPompkelder1_SensorMaxstartwater == 1;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder1_SensorMaxstartwater.aan\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder1_FysiekeRelatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_8_0 sync0_8_0 = new Sync0_8_0();

    private static final class Sync0_8_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = state.s_Tunnel_HoofdPompkelder1_SensorHooghoogwater.lp_Tunnel_HoofdPompkelder1_SensorHooghoogwater == 1;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder1_SensorHooghoogwater.aan\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder1_FysiekeRelatie\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }
}
