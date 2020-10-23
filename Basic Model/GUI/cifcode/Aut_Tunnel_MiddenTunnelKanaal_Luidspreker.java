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

/** Automaton "Tunnel_MiddenTunnelKanaal_Luidspreker". */
public final class Aut_Tunnel_MiddenTunnelKanaal_Luidspreker extends RuntimeSimpleAutomaton<State> {
    public Aut_Tunnel_MiddenTunnelKanaal_Luidspreker() {
        super(getMonitorData(), Spec.MONITOR_EDGE, "cifcode.Aut_Tunnel_MiddenTunnelKanaal_Luidspreker", SPEC.resourceClassLoader);
    }

    @Override
    public String getName() {
        return "Tunnel_MiddenTunnelKanaal_Luidspreker";
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_Tunnel_MiddenTunnelKanaal_Luidspreker.lp_Tunnel_MiddenTunnelKanaal_Luidspreker);
    }

    public static boolean[] getMonitorData() {
        return new boolean[] {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Luidspreker_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(341).get(3);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(227);
        fillSyncData(aut, 341, rslt, state.s_Tunnel_MiddenTunnelKanaal_Luidspreker.lp_Tunnel_MiddenTunnelKanaal_Luidspreker);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Luidspreker_c_aanHand(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(342).get(3);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(227);
        fillSyncData(aut, 342, rslt, state.s_Tunnel_MiddenTunnelKanaal_Luidspreker.lp_Tunnel_MiddenTunnelKanaal_Luidspreker);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Luidspreker_c_onderdrukt(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(343).get(3);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(227);
        fillSyncData(aut, 343, rslt, state.s_Tunnel_MiddenTunnelKanaal_Luidspreker.lp_Tunnel_MiddenTunnelKanaal_Luidspreker);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Luidspreker_c_onderdruktHand(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(344).get(3);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(227);
        fillSyncData(aut, 344, rslt, state.s_Tunnel_MiddenTunnelKanaal_Luidspreker.lp_Tunnel_MiddenTunnelKanaal_Luidspreker);
        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Luidspreker_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(345).get(3);
        rslt.clear();
        RuntimeSimpleAutomaton<State> aut = (RuntimeSimpleAutomaton<State>)SPEC.automata.get(227);
        fillSyncData(aut, 345, rslt, state.s_Tunnel_MiddenTunnelKanaal_Luidspreker.lp_Tunnel_MiddenTunnelKanaal_Luidspreker);
        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        // Simple automaton: no tau.
    }

    @Override
    protected void updateLocPointerValue(State target, int value) {
        target.s_Tunnel_MiddenTunnelKanaal_Luidspreker = target.s_Tunnel_MiddenTunnelKanaal_Luidspreker.copy();
        target.s_Tunnel_MiddenTunnelKanaal_Luidspreker.lp_Tunnel_MiddenTunnelKanaal_Luidspreker = value;
    }
}
