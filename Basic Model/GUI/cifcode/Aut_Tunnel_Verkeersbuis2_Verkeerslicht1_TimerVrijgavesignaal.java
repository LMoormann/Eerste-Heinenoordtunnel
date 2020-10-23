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

/** Automaton "Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal". */
public final class Aut_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal extends RuntimeSimpleAutomaton<State> {
    public Aut_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal() {
        super(getMonitorData(), Spec.MONITOR_EDGE, "cifcode.Aut_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal", SPEC.resourceClassLoader);
    }

    @Override
    public String getName() {
        return "Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal";
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal);
    }

    public static boolean[] getMonitorData() {
        return new boolean[] {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(997).get(4);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(561);
        fillSyncData(aut, 997, rslt, state.s_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal_c_reset(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(998).get(4);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(561);
        fillSyncData(aut, 998, rslt, state.s_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal_u_timeout(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(999).get(1);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(561);
        fillSyncData(aut, 999, rslt, state.s_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal);
        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        // Simple automaton: no tau.
    }

    @Override
    protected void updateLocPointerValue(State target, int value) {
        target.s_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal = target.s_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal.copy();
        target.s_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal = value;
    }
}
