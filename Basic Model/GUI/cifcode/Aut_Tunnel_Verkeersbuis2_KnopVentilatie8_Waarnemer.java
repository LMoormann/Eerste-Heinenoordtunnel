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

/** Automaton "Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer". */
public final class Aut_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer extends RuntimeAutomaton<State> {

    @Override
    public String getName() {
        return "Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer";
    }

    @Override
    public int getLocCount() {
        return 2;
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer);
    }

    @Override
    public String getLocName(int locIdx) {
        switch (locIdx) {
            case 0: return "los";
            case 1: return "ingedrukt";
            default: throw new RuntimeException("Invalid loc idx: " + locIdx);
        }
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopVentilatie8_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(894).get(1);
        rslt.clear();

        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                if (sync0_1_0.evalGuards(state)) rslt.add(sync0_1_0);
                break;
            case 1:
                if (sync1_2_0.evalGuards(state)) rslt.add(sync1_2_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(895).get(2);
        rslt.clear();

        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer) {
            case 1:
                if (sync1_0_0.evalGuards(state)) rslt.add(sync1_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(896).get(2);
        rslt.clear();

        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer) {
            case 1:
                if (sync1_1_0.evalGuards(state)) rslt.add(sync1_1_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        List<RuntimeEdge<State>> edgeData;
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer) {
        }
    }

    private static final Sync0_0_0 sync0_0_0 = new Sync0_0_0();

    private static final class Sync0_0_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_Modus.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_Modus == 1;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_Verkeersbuis2_BedieningVentilatie_Modus.hand\" of an edge of location \"los\" of automaton \"Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            boolean b; // temp var for pred eval rslts
            target.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer = source.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.copy();
            target.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer = 1;
            try {
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Execution of the updates of an edge of location \"los\" of automaton \"Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer\" failed.", e, source);
            }
        }
    }

    private static final Sync0_1_0 sync0_1_0 = new Sync0_1_0();

    private static final class Sync0_1_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = !(state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_Modus.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_Modus == 1);
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"not Tunnel_Verkeersbuis2_BedieningVentilatie_Modus.hand\" of an edge of location \"los\" of automaton \"Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync1_0_0 sync1_0_0 = new Sync1_0_0();

    private static final class Sync1_0_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = (equal(state.s_Tunnel_Verkeersbuis2_Ventilatie.v_stand8, 8)) && (equal(state.s_Tunnel_Verkeersbuis2_VentilatieIngang.v_stand9, 8));
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_Verkeersbuis2_Ventilatie.stand = 8 and Tunnel_Verkeersbuis2_VentilatieIngang.stand = 8\" of an edge of location \"ingedrukt\" of automaton \"Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            boolean b; // temp var for pred eval rslts
            target.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer = source.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.copy();
            target.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer = 0;
            try {
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Execution of the updates of an edge of location \"ingedrukt\" of automaton \"Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer\" failed.", e, source);
            }
        }
    }

    private static final Sync1_1_0 sync1_1_0 = new Sync1_1_0();

    private static final class Sync1_1_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_Modus.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_Modus == 0;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_Verkeersbuis2_BedieningVentilatie_Modus.auto\" of an edge of location \"ingedrukt\" of automaton \"Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            boolean b; // temp var for pred eval rslts
            target.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer = source.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.copy();
            target.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer = 0;
            try {
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Execution of the updates of an edge of location \"ingedrukt\" of automaton \"Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer\" failed.", e, source);
            }
        }
    }

    private static final Sync1_2_0 sync1_2_0 = new Sync1_2_0();

    private static final class Sync1_2_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }
}
