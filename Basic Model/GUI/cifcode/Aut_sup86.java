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

/** Automaton "sup86". */
public final class Aut_sup86 extends RuntimeAutomaton<State> {

    @Override
    public String getName() {
        return "sup86";
    }

    @Override
    public int getLocCount() {
        return 1;
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_sup86.lp_sup86);
    }

    @Override
    public String getLocName(int locIdx) {
        switch (locIdx) {
            case 0: return "*";
            default: throw new RuntimeException("Invalid loc idx: " + locIdx);
        }
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(249).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(250).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_1_0.evalGuards(state)) rslt.add(sync0_1_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Bediening_KnopHand_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(252).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_2_0.evalGuards(state)) rslt.add(sync0_2_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Bediening_KnopHand_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(253).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_3_0.evalGuards(state)) rslt.add(sync0_3_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Bediening_Modus_c_auto(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(254).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_4_0.evalGuards(state)) rslt.add(sync0_4_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Bediening_Modus_c_hand(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(255).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_5_0.evalGuards(state)) rslt.add(sync0_5_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_KnopBergen_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(257).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_6_0.evalGuards(state)) rslt.add(sync0_6_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_KnopBergen_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(258).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_7_0.evalGuards(state)) rslt.add(sync0_7_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_KnopLeeghouden_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(260).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_8_0.evalGuards(state)) rslt.add(sync0_8_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_KnopLeeghouden_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(261).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_9_0.evalGuards(state)) rslt.add(sync0_9_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_KnopUit_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(263).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_10_0.evalGuards(state)) rslt.add(sync0_10_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_KnopUit_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(264).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_11_0.evalGuards(state)) rslt.add(sync0_11_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Pomp1_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(265).get(0);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_12_0.evalGuards(state)) rslt.add(sync0_12_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Pomp1_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(266).get(0);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_13_0.evalGuards(state)) rslt.add(sync0_13_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Pomp2_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(267).get(0);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_14_0.evalGuards(state)) rslt.add(sync0_14_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Pomp2_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(268).get(0);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_15_0.evalGuards(state)) rslt.add(sync0_15_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Regime_c_bergen(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(271).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_16_0.evalGuards(state)) rslt.add(sync0_16_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Regime_c_leeghouden(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(272).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_17_0.evalGuards(state)) rslt.add(sync0_17_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_Regime_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(273).get(1);
        rslt.clear();

        switch (state.s_sup86.lp_sup86) {
            case 0:
                if (sync0_18_0.evalGuards(state)) rslt.add(sync0_18_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        List<RuntimeEdge<State>> edgeData;
        switch (state.s_sup86.lp_sup86) {
        }
    }

    private static final Sync0_0_0 sync0_0_0 = new Sync0_0_0();

    private static final class Sync0_0_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup86\" failed.", e, state);
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
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup86\" failed.", e, state);
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
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
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
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
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
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
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
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
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
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_9_0 sync0_9_0 = new Sync0_9_0();

    private static final class Sync0_9_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_10_0 sync0_10_0 = new Sync0_10_0();

    private static final class Sync0_10_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_11_0 sync0_11_0 = new Sync0_11_0();

    private static final class Sync0_11_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_12_0 sync0_12_0 = new Sync0_12_0();

    private static final class Sync0_12_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_13_0 sync0_13_0 = new Sync0_13_0();

    private static final class Sync0_13_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_14_0 sync0_14_0 = new Sync0_14_0();

    private static final class Sync0_14_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_15_0 sync0_15_0 = new Sync0_15_0();

    private static final class Sync0_15_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_16_0 sync0_16_0 = new Sync0_16_0();

    private static final class Sync0_16_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_17_0 sync0_17_0 = new Sync0_17_0();

    private static final class Sync0_17_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_18_0 sync0_18_0 = new Sync0_18_0();

    private static final class Sync0_18_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup86\" failed.", e, state);
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
