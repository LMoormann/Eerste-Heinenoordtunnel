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

/** Automaton "Tunnel_Verkeersbuis1_Kanaal". */
public final class Aut_Tunnel_Verkeersbuis1_Kanaal extends RuntimeSimpleAutomaton<State> {
    public Aut_Tunnel_Verkeersbuis1_Kanaal() {
        super(getMonitorData(), Spec.MONITOR_EDGE, "cifcode.Aut_Tunnel_Verkeersbuis1_Kanaal", SPEC.resourceClassLoader);
    }

    @Override
    public String getName() {
        return "Tunnel_Verkeersbuis1_Kanaal";
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
    }

    public static boolean[] getMonitorData() {
        return new boolean[] {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Kanaal_c_aan1(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(428).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(272);
        fillSyncData(aut, 428, rslt, state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Kanaal_c_aan2(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(429).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(272);
        fillSyncData(aut, 429, rslt, state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Kanaal_c_aan3(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(430).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(272);
        fillSyncData(aut, 430, rslt, state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Kanaal_c_aan4(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(431).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(272);
        fillSyncData(aut, 431, rslt, state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Kanaal_c_aan5(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(432).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(272);
        fillSyncData(aut, 432, rslt, state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Kanaal_c_aan6(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(433).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(272);
        fillSyncData(aut, 433, rslt, state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Kanaal_c_uit1(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(434).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(272);
        fillSyncData(aut, 434, rslt, state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Kanaal_c_uit2(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(435).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(272);
        fillSyncData(aut, 435, rslt, state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Kanaal_c_uit3(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(436).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(272);
        fillSyncData(aut, 436, rslt, state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Kanaal_c_uit4(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(437).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(272);
        fillSyncData(aut, 437, rslt, state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Kanaal_c_uit5(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(438).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(272);
        fillSyncData(aut, 438, rslt, state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Kanaal_c_uit6(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(439).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(272);
        fillSyncData(aut, 439, rslt, state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal);
        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        // Simple automaton: no tau.
    }

    @Override
    protected void updateLocPointerValue(State target, int value) {
        target.s_Tunnel_Verkeersbuis1_Kanaal = target.s_Tunnel_Verkeersbuis1_Kanaal.copy();
        target.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal = value;
    }
}
