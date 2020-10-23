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

/** Automaton "Tunnel_HoofdPompkelder2_FysiekeRelatie". */
public final class Aut_Tunnel_HoofdPompkelder2_FysiekeRelatie extends RuntimeAutomaton<State> {

    @Override
    public String getName() {
        return "Tunnel_HoofdPompkelder2_FysiekeRelatie";
    }

    @Override
    public int getLocCount() {
        return 1;
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie);
    }

    @Override
    public String getLocName(int locIdx) {
        switch (locIdx) {
            case 0: return "*";
            default: throw new RuntimeException("Invalid loc idx: " + locIdx);
        }
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorHooghoogwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(238).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie) {
            case 0:
                if (sync0_8_0.evalGuards(state)) rslt.add(sync0_8_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorHooghoogwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(239).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie) {
            case 0:
                if (sync0_4_0.evalGuards(state)) rslt.add(sync0_4_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorLaaghoogwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(240).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie) {
            case 0:
                if (sync0_7_0.evalGuards(state)) rslt.add(sync0_7_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorLaaghoogwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(241).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie) {
            case 0:
                if (sync0_3_0.evalGuards(state)) rslt.add(sync0_3_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorLaagwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(243).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorMaxstartwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(244).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie) {
            case 0:
                if (sync0_6_0.evalGuards(state)) rslt.add(sync0_6_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorMaxstartwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(245).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie) {
            case 0:
                if (sync0_2_0.evalGuards(state)) rslt.add(sync0_2_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorStartwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(246).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie) {
            case 0:
                if (sync0_5_0.evalGuards(state)) rslt.add(sync0_5_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorStartwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(247).get(1);
        rslt.clear();

        switch (state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie) {
            case 0:
                if (sync0_1_0.evalGuards(state)) rslt.add(sync0_1_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        List<RuntimeEdge<State>> edgeData;
        switch (state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie) {
        }
    }

    private static final Sync0_0_0 sync0_0_0 = new Sync0_0_0();

    private static final class Sync0_0_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = (state.s_Tunnel_HoofdPompkelder2_SensorStartwater.lp_Tunnel_HoofdPompkelder2_SensorStartwater == 0) && ((state.s_Tunnel_HoofdPompkelder2_Pomp1.lp_Tunnel_HoofdPompkelder2_Pomp1 == 1) || (state.s_Tunnel_HoofdPompkelder2_Pomp2.lp_Tunnel_HoofdPompkelder2_Pomp2 == 1));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder2_SensorStartwater.uit and (Tunnel_HoofdPompkelder2_Pomp1.aan or Tunnel_HoofdPompkelder2_Pomp2.aan)\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder2_FysiekeRelatie\" failed.", e, state);
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
                b = (state.s_Tunnel_HoofdPompkelder2_SensorMaxstartwater.lp_Tunnel_HoofdPompkelder2_SensorMaxstartwater == 0) && ((state.s_Tunnel_HoofdPompkelder2_Pomp1.lp_Tunnel_HoofdPompkelder2_Pomp1 == 1) || (state.s_Tunnel_HoofdPompkelder2_Pomp2.lp_Tunnel_HoofdPompkelder2_Pomp2 == 1));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder2_SensorMaxstartwater.uit and (Tunnel_HoofdPompkelder2_Pomp1.aan or Tunnel_HoofdPompkelder2_Pomp2.aan)\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder2_FysiekeRelatie\" failed.", e, state);
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
                b = (state.s_Tunnel_HoofdPompkelder2_SensorLaaghoogwater.lp_Tunnel_HoofdPompkelder2_SensorLaaghoogwater == 0) && ((state.s_Tunnel_HoofdPompkelder2_Pomp1.lp_Tunnel_HoofdPompkelder2_Pomp1 == 1) || (state.s_Tunnel_HoofdPompkelder2_Pomp2.lp_Tunnel_HoofdPompkelder2_Pomp2 == 1));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder2_SensorLaaghoogwater.uit and (Tunnel_HoofdPompkelder2_Pomp1.aan or Tunnel_HoofdPompkelder2_Pomp2.aan)\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder2_FysiekeRelatie\" failed.", e, state);
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
                b = (state.s_Tunnel_HoofdPompkelder2_SensorHooghoogwater.lp_Tunnel_HoofdPompkelder2_SensorHooghoogwater == 0) && ((state.s_Tunnel_HoofdPompkelder2_Pomp1.lp_Tunnel_HoofdPompkelder2_Pomp1 == 1) || (state.s_Tunnel_HoofdPompkelder2_Pomp2.lp_Tunnel_HoofdPompkelder2_Pomp2 == 1));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder2_SensorHooghoogwater.uit and (Tunnel_HoofdPompkelder2_Pomp1.aan or Tunnel_HoofdPompkelder2_Pomp2.aan)\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder2_FysiekeRelatie\" failed.", e, state);
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
                b = (state.s_Tunnel_HoofdPompkelder2_Pomp1.lp_Tunnel_HoofdPompkelder2_Pomp1 == 1) || (state.s_Tunnel_HoofdPompkelder2_Pomp2.lp_Tunnel_HoofdPompkelder2_Pomp2 == 1);
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder2_Pomp1.aan or Tunnel_HoofdPompkelder2_Pomp2.aan\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder2_FysiekeRelatie\" failed.", e, state);
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
                b = state.s_Tunnel_HoofdPompkelder2_SensorLaagwater.lp_Tunnel_HoofdPompkelder2_SensorLaagwater == 1;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder2_SensorLaagwater.aan\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder2_FysiekeRelatie\" failed.", e, state);
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
                b = state.s_Tunnel_HoofdPompkelder2_SensorStartwater.lp_Tunnel_HoofdPompkelder2_SensorStartwater == 1;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder2_SensorStartwater.aan\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder2_FysiekeRelatie\" failed.", e, state);
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
                b = state.s_Tunnel_HoofdPompkelder2_SensorMaxstartwater.lp_Tunnel_HoofdPompkelder2_SensorMaxstartwater == 1;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder2_SensorMaxstartwater.aan\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder2_FysiekeRelatie\" failed.", e, state);
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
                b = state.s_Tunnel_HoofdPompkelder2_SensorHooghoogwater.lp_Tunnel_HoofdPompkelder2_SensorHooghoogwater == 1;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_HoofdPompkelder2_SensorHooghoogwater.aan\" of an edge of the location of automaton \"Tunnel_HoofdPompkelder2_FysiekeRelatie\" failed.", e, state);
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
