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

/** Automaton "besturing_selectie_tunneldeel_detailplattegrond". */
public final class Aut_besturing_selectie_tunneldeel_detailplattegrond extends RuntimeSimpleAutomaton<State> {
    public Aut_besturing_selectie_tunneldeel_detailplattegrond() {
        super(getMonitorData(), Spec.MONITOR_EDGE, "cifcode.Aut_besturing_selectie_tunneldeel_detailplattegrond", SPEC.resourceClassLoader);
    }

    @Override
    public String getName() {
        return "besturing_selectie_tunneldeel_detailplattegrond";
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond);
    }

    public static boolean[] getMonitorData() {
        return new boolean[] {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    }

    public static boolean fillSyncData_evt_besturing_selectie_tunneldeel_detailplattegrond_select_sectie1(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(0).get(0);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(0);
        fillSyncData(aut, 0, rslt, state.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_besturing_selectie_tunneldeel_detailplattegrond_select_sectie2(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1).get(0);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(0);
        fillSyncData(aut, 1, rslt, state.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_besturing_selectie_tunneldeel_detailplattegrond_select_sectie3(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(2).get(0);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(0);
        fillSyncData(aut, 2, rslt, state.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_besturing_selectie_tunneldeel_detailplattegrond_select_sectie4(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(3).get(0);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(0);
        fillSyncData(aut, 3, rslt, state.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_besturing_selectie_tunneldeel_detailplattegrond_select_sectie5(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(4).get(0);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(0);
        fillSyncData(aut, 4, rslt, state.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_besturing_selectie_tunneldeel_detailplattegrond_select_sectie6(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(5).get(0);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(0);
        fillSyncData(aut, 5, rslt, state.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_besturing_selectie_tunneldeel_detailplattegrond_select_sectie7(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(6).get(0);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(0);
        fillSyncData(aut, 6, rslt, state.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_besturing_selectie_tunneldeel_detailplattegrond_select_sectie8(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(7).get(0);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(0);
        fillSyncData(aut, 7, rslt, state.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_besturing_selectie_tunneldeel_detailplattegrond_select_sectie9(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(8).get(0);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(0);
        fillSyncData(aut, 8, rslt, state.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond);
        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        // Simple automaton: no tau.
    }

    @Override
    protected void updateLocPointerValue(State target, int value) {
        target.s_besturing_selectie_tunneldeel_detailplattegrond = target.s_besturing_selectie_tunneldeel_detailplattegrond.copy();
        target.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond = value;
    }
}
