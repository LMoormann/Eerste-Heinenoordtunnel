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

/** Automaton "event_disabler". */
public final class Aut_event_disabler extends RuntimeAutomaton<State> {

    @Override
    public String getName() {
        return "event_disabler";
    }

    @Override
    public int getLocCount() {
        return 1;
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_event_disabler.lp_event_disabler);
    }

    @Override
    public String getLocName(int locIdx) {
        switch (locIdx) {
            case 0: return "*";
            default: throw new RuntimeException("Invalid loc idx: " + locIdx);
        }
    }

    public static boolean fillSyncData_evt_Tunnel_BrandBlusInstallatie_SensorHoog_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(176).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_BrandBlusInstallatie_SensorHoog_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(177).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_BrandBlusInstallatie_SensorLaag_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(178).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_BrandBlusInstallatie_SensorLaag_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(179).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorHooghoogwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(204).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorHooghoogwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(205).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorLaaghoogwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(206).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorLaaghoogwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(207).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorLaagwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(208).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorLaagwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(209).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorMaxstartwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(210).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorMaxstartwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(211).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorStartwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(212).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder1_SensorStartwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(213).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorHooghoogwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(238).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorHooghoogwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(239).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorLaaghoogwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(240).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorLaaghoogwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(241).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorLaagwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(242).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorLaagwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(243).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorMaxstartwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(244).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorMaxstartwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(245).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorStartwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(246).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_HoofdPompkelder2_SensorStartwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(247).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_SensorHooghoogwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(274).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_SensorHooghoogwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(275).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_SensorLaaghoogwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(276).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_SensorLaaghoogwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(277).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_SensorLaagwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(278).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_SensorLaagwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(279).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_SensorMaxstartwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(280).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_SensorMaxstartwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(281).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_SensorStartwater_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(282).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenPompkelder_SensorStartwater_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(283).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(329).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(332).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Afsluitboom1_ObstakelDetectie_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(357).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Afsluitboom1_ObstakelDetectie_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(358).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Afsluitboom1_SensorDicht_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(359).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Afsluitboom1_SensorDicht_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(360).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Afsluitboom1_SensorOpen_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(361).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Afsluitboom1_SensorOpen_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(362).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Afsluitboom2_ObstakelDetectie_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(369).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Afsluitboom2_ObstakelDetectie_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(370).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Afsluitboom2_SensorDicht_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(371).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Afsluitboom2_SensorDicht_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(372).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Afsluitboom2_SensorOpen_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(373).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Afsluitboom2_SensorOpen_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(374).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastA_Brandslang_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(409).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastA_Brandslang_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(410).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastA_Handblusser_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(411).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastA_Handblusser_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(412).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastA_Noodtelefoon_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(413).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastA_Noodtelefoon_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(414).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastA_SensorOpen_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(415).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastA_SensorOpen_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(416).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastC_Handblusser_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(417).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastC_Handblusser_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(418).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastC_Noodtelefoon_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(419).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastC_Noodtelefoon_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(420).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastC_SensorOpen_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(421).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_HulppostkastC_SensorOpen_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(422).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_J32_TimerVrijgavesignaal_u_timeout(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(427).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(476).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(488).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(491).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopStartBoodschap_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(494).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopStartLive_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(497).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopStopBoodschap_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(503).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopStopLive_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(506).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Lichtsensor_u_0(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(566).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Lichtsensor_u_1(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(567).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Lichtsensor_u_2(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(568).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Lichtsensor_u_3(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(569).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Lichtsensor_u_4(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(570).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Lichtsensor_u_5(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(571).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Lichtsensor_u_6(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(572).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Lichtsensor_u_7(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(573).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Lichtsensor_u_8(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(574).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Rookdetectie_u_0(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(598).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Rookdetectie_u_1(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(599).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Rookdetectie_u_2(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(600).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Rookdetectie_u_3(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(601).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Rookdetectie_u_4(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(602).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Rookdetectie_u_5(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(603).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Rookdetectie_u_6(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(604).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Rookdetectie_u_7(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(605).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Rookdetectie_u_8(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(606).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Verkeerslicht1_TimerVrijgavesignaal_u_timeout(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(641).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Verkeerslicht1_Vrijgavesignaal_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(642).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Verkeerslicht1_Vrijgavesignaal_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(643).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Verkeerslicht2_TimerVrijgavesignaal_u_timeout(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(650).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Verkeerslicht2_Vrijgavesignaal_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(651).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Verkeerslicht2_Vrijgavesignaal_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(652).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Verkeerslicht3_TimerVrijgavesignaal_u_timeout(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(659).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Verkeerslicht3_Vrijgavesignaal_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(660).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Verkeerslicht3_Vrijgavesignaal_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(661).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_SensorOpen_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(704).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_SensorOpen_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(705).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_WisselTimerAudio_u_timeout(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(708).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Afsluitboom1_ObstakelDetectie_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(715).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Afsluitboom1_ObstakelDetectie_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(716).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Afsluitboom1_SensorDicht_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(717).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Afsluitboom1_SensorDicht_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(718).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Afsluitboom1_SensorOpen_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(719).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Afsluitboom1_SensorOpen_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(720).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Afsluitboom2_ObstakelDetectie_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(727).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Afsluitboom2_ObstakelDetectie_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(728).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Afsluitboom2_SensorDicht_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(729).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Afsluitboom2_SensorDicht_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(730).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Afsluitboom2_SensorOpen_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(731).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Afsluitboom2_SensorOpen_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(732).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastA_Brandslang_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(767).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastA_Brandslang_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(768).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastA_Handblusser_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(769).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastA_Handblusser_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(770).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastA_Noodtelefoon_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(771).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastA_Noodtelefoon_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(772).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastA_SensorOpen_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(773).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastA_SensorOpen_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(774).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastC_Handblusser_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(775).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastC_Handblusser_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(776).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastC_Noodtelefoon_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(777).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastC_Noodtelefoon_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(778).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastC_SensorOpen_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(779).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_HulppostkastC_SensorOpen_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(780).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_J32_TimerVrijgavesignaal_u_timeout(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(785).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(834).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(846).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(849).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopStartBoodschap_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(852).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopStartLive_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(855).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopStopBoodschap_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(861).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopStopLive_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(864).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Lichtsensor_u_0(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(924).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Lichtsensor_u_1(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(925).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Lichtsensor_u_2(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(926).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Lichtsensor_u_3(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(927).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Lichtsensor_u_4(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(928).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Lichtsensor_u_5(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(929).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Lichtsensor_u_6(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(930).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Lichtsensor_u_7(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(931).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Lichtsensor_u_8(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(932).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(943).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Knop_u_indrukken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(946).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_PopUp_Timer_u_timeout(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(951).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Rookdetectie_u_0(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(956).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Rookdetectie_u_1(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(957).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Rookdetectie_u_2(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(958).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Rookdetectie_u_3(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(959).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Rookdetectie_u_4(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(960).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Rookdetectie_u_5(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(961).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Rookdetectie_u_6(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(962).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Rookdetectie_u_7(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(963).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Rookdetectie_u_8(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(964).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_SOS_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(966).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal_u_timeout(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(999).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Verkeerslicht1_Vrijgavesignaal_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1000).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Verkeerslicht1_Vrijgavesignaal_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1001).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Verkeerslicht2_TimerVrijgavesignaal_u_timeout(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1008).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Verkeerslicht2_Vrijgavesignaal_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1009).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Verkeerslicht2_Vrijgavesignaal_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1010).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Verkeerslicht3_TimerVrijgavesignaal_u_timeout(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1017).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Verkeerslicht3_Vrijgavesignaal_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1018).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Verkeerslicht3_Vrijgavesignaal_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1019).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_SensorOpen_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1062).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_SensorOpen_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1063).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_WisselTimerAudio_u_timeout(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1066).get(0);
        rslt.clear();

        switch (state.s_event_disabler.lp_event_disabler) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        List<RuntimeEdge<State>> edgeData;
        switch (state.s_event_disabler.lp_event_disabler) {
        }
    }

    private static final Sync0_0_0 sync0_0_0 = new Sync0_0_0();

    private static final class Sync0_0_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"event_disabler\" failed.", e, state);
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
