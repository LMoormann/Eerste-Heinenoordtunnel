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

/** Automaton "sup35". */
public final class Aut_sup35 extends RuntimeAutomaton<State> {

    @Override
    public String getName() {
        return "sup35";
    }

    @Override
    public int getLocCount() {
        return 1;
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_sup35.lp_sup35);
    }

    @Override
    public String getLocName(int locIdx) {
        switch (locIdx) {
            case 0: return "*";
            default: throw new RuntimeException("Invalid loc idx: " + locIdx);
        }
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(285).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(286).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_1_0.evalGuards(state)) rslt.add(sync0_1_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(288).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_2_0.evalGuards(state)) rslt.add(sync0_2_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(289).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_3_0.evalGuards(state)) rslt.add(sync0_3_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_Modus_c_auto(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(290).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_4_0.evalGuards(state)) rslt.add(sync0_4_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_Modus_c_hand(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(291).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_5_0.evalGuards(state)) rslt.add(sync0_5_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(293).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_6_0.evalGuards(state)) rslt.add(sync0_6_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(294).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_7_0.evalGuards(state)) rslt.add(sync0_7_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(296).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_8_0.evalGuards(state)) rslt.add(sync0_8_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(297).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_9_0.evalGuards(state)) rslt.add(sync0_9_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_Modus_c_auto(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(298).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_10_0.evalGuards(state)) rslt.add(sync0_10_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_Modus_c_hand(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(299).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_11_0.evalGuards(state)) rslt.add(sync0_11_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_DynamischeVluchtrouteIndicatie_c_aflopend(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(308).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_12_0.evalGuards(state)) rslt.add(sync0_12_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_DynamischeVluchtrouteIndicatie_c_oplopend(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(309).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_13_0.evalGuards(state)) rslt.add(sync0_13_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_DynamischeVluchtrouteIndicatie_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(310).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_14_0.evalGuards(state)) rslt.add(sync0_14_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(312).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_15_0.evalGuards(state)) rslt.add(sync0_15_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(313).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_16_0.evalGuards(state)) rslt.add(sync0_16_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(315).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_17_0.evalGuards(state)) rslt.add(sync0_17_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(316).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_18_0.evalGuards(state)) rslt.add(sync0_18_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(318).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_19_0.evalGuards(state)) rslt.add(sync0_19_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(319).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_20_0.evalGuards(state)) rslt.add(sync0_20_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(321).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_21_0.evalGuards(state)) rslt.add(sync0_21_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(322).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_22_0.evalGuards(state)) rslt.add(sync0_22_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(324).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_23_0.evalGuards(state)) rslt.add(sync0_23_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(325).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_24_0.evalGuards(state)) rslt.add(sync0_24_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(327).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_25_0.evalGuards(state)) rslt.add(sync0_25_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(328).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_26_0.evalGuards(state)) rslt.add(sync0_26_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Overdruk_c_links(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(346).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_27_0.evalGuards(state)) rslt.add(sync0_27_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Overdruk_c_rechts(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(347).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_28_0.evalGuards(state)) rslt.add(sync0_28_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Overdruk_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(348).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_29_0.evalGuards(state)) rslt.add(sync0_29_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Evacuatie_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(407).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_30_0.evalGuards(state)) rslt.add(sync0_30_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Evacuatie_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(408).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_31_0.evalGuards(state)) rslt.add(sync0_31_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopCalamiteit_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(441).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_32_0.evalGuards(state)) rslt.add(sync0_32_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopCalamiteit_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(442).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_33_0.evalGuards(state)) rslt.add(sync0_33_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopEvacuatie_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(462).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_34_0.evalGuards(state)) rslt.add(sync0_34_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopEvacuatie_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(463).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_35_0.evalGuards(state)) rslt.add(sync0_35_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopHerstel_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(465).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_36_0.evalGuards(state)) rslt.add(sync0_36_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopHerstel_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(466).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_37_0.evalGuards(state)) rslt.add(sync0_37_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopOnderhoud_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(471).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_38_0.evalGuards(state)) rslt.add(sync0_38_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopOnderhoud_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(472).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_39_0.evalGuards(state)) rslt.add(sync0_39_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopOperationeel_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(480).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_40_0.evalGuards(state)) rslt.add(sync0_40_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopOperationeel_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(481).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_41_0.evalGuards(state)) rslt.add(sync0_41_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Onderhoud_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(583).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_42_0.evalGuards(state)) rslt.add(sync0_42_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Onderhoud_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(584).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_43_0.evalGuards(state)) rslt.add(sync0_43_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(586).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_44_0.evalGuards(state)) rslt.add(sync0_44_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(587).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_45_0.evalGuards(state)) rslt.add(sync0_45_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(589).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_46_0.evalGuards(state)) rslt.add(sync0_46_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(590).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_47_0.evalGuards(state)) rslt.add(sync0_47_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_PopUp_Timer_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(591).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_48_0.evalGuards(state)) rslt.add(sync0_48_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_PopUp_Timer_c_reset(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(592).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_49_0.evalGuards(state)) rslt.add(sync0_49_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_PopUp_Venster_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(594).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_50_0.evalGuards(state)) rslt.add(sync0_50_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_PopUp_Venster_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(595).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_51_0.evalGuards(state)) rslt.add(sync0_51_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Recorder_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(596).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_52_0.evalGuards(state)) rslt.add(sync0_52_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Recorder_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(597).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_53_0.evalGuards(state)) rslt.add(sync0_53_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Standby_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(609).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_54_0.evalGuards(state)) rslt.add(sync0_54_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Standby_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(610).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_55_0.evalGuards(state)) rslt.add(sync0_55_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_StandVerkeersbuis_c_calamiteit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(611).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_56_0.evalGuards(state)) rslt.add(sync0_56_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_StandVerkeersbuis_c_herstel(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(612).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_57_0.evalGuards(state)) rslt.add(sync0_57_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_StandVerkeersbuis_c_ondersteunend(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(613).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_58_0.evalGuards(state)) rslt.add(sync0_58_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_StandVerkeersbuis_c_operationeel(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(614).get(1);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_59_0.evalGuards(state)) rslt.add(sync0_59_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_VentilatieRichting_c_rijrichting(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(633).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_60_0.evalGuards(state)) rslt.add(sync0_60_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_VentilatieRichting_c_tegenRijrichting(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(634).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_61_0.evalGuards(state)) rslt.add(sync0_61_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(672).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_62_0.evalGuards(state)) rslt.add(sync0_62_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(673).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_63_0.evalGuards(state)) rslt.add(sync0_63_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(675).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_64_0.evalGuards(state)) rslt.add(sync0_64_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(676).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_65_0.evalGuards(state)) rslt.add(sync0_65_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_Modus_c_auto(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(677).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_66_0.evalGuards(state)) rslt.add(sync0_66_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_Modus_c_hand(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(678).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_67_0.evalGuards(state)) rslt.add(sync0_67_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_ContourVerlichting_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(687).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_68_0.evalGuards(state)) rslt.add(sync0_68_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_ContourVerlichting_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(688).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_69_0.evalGuards(state)) rslt.add(sync0_69_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(693).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_70_0.evalGuards(state)) rslt.add(sync0_70_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(694).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_71_0.evalGuards(state)) rslt.add(sync0_71_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(696).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_72_0.evalGuards(state)) rslt.add(sync0_72_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(697).get(0);
        rslt.clear();

        switch (state.s_sup35.lp_sup35) {
            case 0:
                if (sync0_73_0.evalGuards(state)) rslt.add(sync0_73_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        List<RuntimeEdge<State>> edgeData;
        switch (state.s_sup35.lp_sup35) {
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_19_0 sync0_19_0 = new Sync0_19_0();

    private static final class Sync0_19_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_20_0 sync0_20_0 = new Sync0_20_0();

    private static final class Sync0_20_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_21_0 sync0_21_0 = new Sync0_21_0();

    private static final class Sync0_21_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_22_0 sync0_22_0 = new Sync0_22_0();

    private static final class Sync0_22_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_23_0 sync0_23_0 = new Sync0_23_0();

    private static final class Sync0_23_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_24_0 sync0_24_0 = new Sync0_24_0();

    private static final class Sync0_24_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_25_0 sync0_25_0 = new Sync0_25_0();

    private static final class Sync0_25_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_26_0 sync0_26_0 = new Sync0_26_0();

    private static final class Sync0_26_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_27_0 sync0_27_0 = new Sync0_27_0();

    private static final class Sync0_27_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_28_0 sync0_28_0 = new Sync0_28_0();

    private static final class Sync0_28_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_29_0 sync0_29_0 = new Sync0_29_0();

    private static final class Sync0_29_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_30_0 sync0_30_0 = new Sync0_30_0();

    private static final class Sync0_30_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_31_0 sync0_31_0 = new Sync0_31_0();

    private static final class Sync0_31_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_32_0 sync0_32_0 = new Sync0_32_0();

    private static final class Sync0_32_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_33_0 sync0_33_0 = new Sync0_33_0();

    private static final class Sync0_33_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_34_0 sync0_34_0 = new Sync0_34_0();

    private static final class Sync0_34_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_35_0 sync0_35_0 = new Sync0_35_0();

    private static final class Sync0_35_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_36_0 sync0_36_0 = new Sync0_36_0();

    private static final class Sync0_36_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_37_0 sync0_37_0 = new Sync0_37_0();

    private static final class Sync0_37_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_38_0 sync0_38_0 = new Sync0_38_0();

    private static final class Sync0_38_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_39_0 sync0_39_0 = new Sync0_39_0();

    private static final class Sync0_39_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_40_0 sync0_40_0 = new Sync0_40_0();

    private static final class Sync0_40_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_41_0 sync0_41_0 = new Sync0_41_0();

    private static final class Sync0_41_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_42_0 sync0_42_0 = new Sync0_42_0();

    private static final class Sync0_42_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_43_0 sync0_43_0 = new Sync0_43_0();

    private static final class Sync0_43_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_44_0 sync0_44_0 = new Sync0_44_0();

    private static final class Sync0_44_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_45_0 sync0_45_0 = new Sync0_45_0();

    private static final class Sync0_45_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_46_0 sync0_46_0 = new Sync0_46_0();

    private static final class Sync0_46_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_47_0 sync0_47_0 = new Sync0_47_0();

    private static final class Sync0_47_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_48_0 sync0_48_0 = new Sync0_48_0();

    private static final class Sync0_48_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_49_0 sync0_49_0 = new Sync0_49_0();

    private static final class Sync0_49_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_50_0 sync0_50_0 = new Sync0_50_0();

    private static final class Sync0_50_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_51_0 sync0_51_0 = new Sync0_51_0();

    private static final class Sync0_51_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_52_0 sync0_52_0 = new Sync0_52_0();

    private static final class Sync0_52_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_53_0 sync0_53_0 = new Sync0_53_0();

    private static final class Sync0_53_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_54_0 sync0_54_0 = new Sync0_54_0();

    private static final class Sync0_54_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_55_0 sync0_55_0 = new Sync0_55_0();

    private static final class Sync0_55_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_56_0 sync0_56_0 = new Sync0_56_0();

    private static final class Sync0_56_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_57_0 sync0_57_0 = new Sync0_57_0();

    private static final class Sync0_57_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_58_0 sync0_58_0 = new Sync0_58_0();

    private static final class Sync0_58_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_59_0 sync0_59_0 = new Sync0_59_0();

    private static final class Sync0_59_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_60_0 sync0_60_0 = new Sync0_60_0();

    private static final class Sync0_60_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_61_0 sync0_61_0 = new Sync0_61_0();

    private static final class Sync0_61_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_62_0 sync0_62_0 = new Sync0_62_0();

    private static final class Sync0_62_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_63_0 sync0_63_0 = new Sync0_63_0();

    private static final class Sync0_63_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_64_0 sync0_64_0 = new Sync0_64_0();

    private static final class Sync0_64_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_65_0 sync0_65_0 = new Sync0_65_0();

    private static final class Sync0_65_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_66_0 sync0_66_0 = new Sync0_66_0();

    private static final class Sync0_66_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_67_0 sync0_67_0 = new Sync0_67_0();

    private static final class Sync0_67_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_68_0 sync0_68_0 = new Sync0_68_0();

    private static final class Sync0_68_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_69_0 sync0_69_0 = new Sync0_69_0();

    private static final class Sync0_69_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_70_0 sync0_70_0 = new Sync0_70_0();

    private static final class Sync0_70_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_71_0 sync0_71_0 = new Sync0_71_0();

    private static final class Sync0_71_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_72_0 sync0_72_0 = new Sync0_72_0();

    private static final class Sync0_72_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
            }
            if (!b) return false;
            return true;
        }

        @Override
        public void update(State source, State target) {
            // No updates.
        }
    }

    private static final Sync0_73_0 sync0_73_0 = new Sync0_73_0();

    private static final class Sync0_73_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup35\" failed.", e, state);
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
