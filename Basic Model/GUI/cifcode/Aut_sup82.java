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

/** Automaton "sup82". */
public final class Aut_sup82 extends RuntimeAutomaton<State> {

    @Override
    public String getName() {
        return "sup82";
    }

    @Override
    public int getLocCount() {
        return 1;
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_sup82.lp_sup82);
    }

    @Override
    public String getLocName(int locIdx) {
        switch (locIdx) {
            case 0: return "*";
            default: throw new RuntimeException("Invalid loc idx: " + locIdx);
        }
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(330).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(331).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_1_0.evalGuards(state)) rslt.add(sync0_1_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(333).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_2_0.evalGuards(state)) rslt.add(sync0_2_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(334).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_3_0.evalGuards(state)) rslt.add(sync0_3_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Luidspreker_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(341).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_4_0.evalGuards(state)) rslt.add(sync0_4_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Luidspreker_c_aanHand(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(342).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_5_0.evalGuards(state)) rslt.add(sync0_5_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Luidspreker_c_onderdrukt(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(343).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_6_0.evalGuards(state)) rslt.add(sync0_6_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Luidspreker_c_onderdruktHand(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(344).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_7_0.evalGuards(state)) rslt.add(sync0_7_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_MiddenTunnelKanaal_Luidspreker_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(345).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_8_0.evalGuards(state)) rslt.add(sync0_8_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopStartBoodschap_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(495).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_9_0.evalGuards(state)) rslt.add(sync0_9_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopStartBoodschap_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(496).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_10_0.evalGuards(state)) rslt.add(sync0_10_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopStartLive_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(498).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_11_0.evalGuards(state)) rslt.add(sync0_11_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopStartLive_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(499).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_12_0.evalGuards(state)) rslt.add(sync0_12_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopStopBoodschap_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(504).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_13_0.evalGuards(state)) rslt.add(sync0_13_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopStopBoodschap_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(505).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_14_0.evalGuards(state)) rslt.add(sync0_14_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopStopLive_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(507).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_15_0.evalGuards(state)) rslt.add(sync0_15_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_KnopStopLive_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(508).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_16_0.evalGuards(state)) rslt.add(sync0_16_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Luidspreker_c_boodschap(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(575).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_17_0.evalGuards(state)) rslt.add(sync0_17_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Luidspreker_c_live(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(576).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_18_0.evalGuards(state)) rslt.add(sync0_18_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Luidspreker_c_onderdrukt(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(577).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_19_0.evalGuards(state)) rslt.add(sync0_19_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Luidspreker_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(578).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_20_0.evalGuards(state)) rslt.add(sync0_20_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(680).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_21_0.evalGuards(state)) rslt.add(sync0_21_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(681).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_22_0.evalGuards(state)) rslt.add(sync0_22_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(683).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_23_0.evalGuards(state)) rslt.add(sync0_23_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(684).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_24_0.evalGuards(state)) rslt.add(sync0_24_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_Modus_c_auto(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(685).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_25_0.evalGuards(state)) rslt.add(sync0_25_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_Modus_c_hand(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(686).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_26_0.evalGuards(state)) rslt.add(sync0_26_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_Geluidsbaken_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(689).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_27_0.evalGuards(state)) rslt.add(sync0_27_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_Geluidsbaken_c_onderdrukt(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(690).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_28_0.evalGuards(state)) rslt.add(sync0_28_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_Geluidsbaken_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(691).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_29_0.evalGuards(state)) rslt.add(sync0_29_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(699).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_30_0.evalGuards(state)) rslt.add(sync0_30_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(700).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_31_0.evalGuards(state)) rslt.add(sync0_31_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(702).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_32_0.evalGuards(state)) rslt.add(sync0_32_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(703).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_33_0.evalGuards(state)) rslt.add(sync0_33_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_WisselTimerAudio_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(706).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_34_0.evalGuards(state)) rslt.add(sync0_34_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis1_WisselTimerAudio_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(707).get(1);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_35_0.evalGuards(state)) rslt.add(sync0_35_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopStartBoodschap_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(853).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_36_0.evalGuards(state)) rslt.add(sync0_36_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopStartBoodschap_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(854).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_37_0.evalGuards(state)) rslt.add(sync0_37_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopStartLive_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(856).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_38_0.evalGuards(state)) rslt.add(sync0_38_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopStartLive_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(857).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_39_0.evalGuards(state)) rslt.add(sync0_39_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopStopBoodschap_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(862).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_40_0.evalGuards(state)) rslt.add(sync0_40_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopStopBoodschap_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(863).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_41_0.evalGuards(state)) rslt.add(sync0_41_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopStopLive_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(865).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_42_0.evalGuards(state)) rslt.add(sync0_42_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_KnopStopLive_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(866).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_43_0.evalGuards(state)) rslt.add(sync0_43_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Luidspreker_c_boodschap(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(933).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_44_0.evalGuards(state)) rslt.add(sync0_44_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Luidspreker_c_live(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(934).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_45_0.evalGuards(state)) rslt.add(sync0_45_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Luidspreker_c_onderdrukt(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(935).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_46_0.evalGuards(state)) rslt.add(sync0_46_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Luidspreker_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(936).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_47_0.evalGuards(state)) rslt.add(sync0_47_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1038).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_48_0.evalGuards(state)) rslt.add(sync0_48_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1039).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_49_0.evalGuards(state)) rslt.add(sync0_49_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1041).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_50_0.evalGuards(state)) rslt.add(sync0_50_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1042).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_51_0.evalGuards(state)) rslt.add(sync0_51_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_Modus_c_auto(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1043).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_52_0.evalGuards(state)) rslt.add(sync0_52_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_Modus_c_hand(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1044).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_53_0.evalGuards(state)) rslt.add(sync0_53_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_Geluidsbaken_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1047).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_54_0.evalGuards(state)) rslt.add(sync0_54_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_Geluidsbaken_c_onderdrukt(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1048).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_55_0.evalGuards(state)) rslt.add(sync0_55_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_Geluidsbaken_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1049).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_56_0.evalGuards(state)) rslt.add(sync0_56_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1057).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_57_0.evalGuards(state)) rslt.add(sync0_57_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1058).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_58_0.evalGuards(state)) rslt.add(sync0_58_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer_c_klaar(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1060).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_59_0.evalGuards(state)) rslt.add(sync0_59_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer_c_onderbroken(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1061).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_60_0.evalGuards(state)) rslt.add(sync0_60_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_WisselTimerAudio_c_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1064).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_61_0.evalGuards(state)) rslt.add(sync0_61_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_Verkeersbuis2_WisselTimerAudio_c_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(1065).get(2);
        rslt.clear();

        switch (state.s_sup82.lp_sup82) {
            case 0:
                if (sync0_62_0.evalGuards(state)) rslt.add(sync0_62_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        List<RuntimeEdge<State>> edgeData;
        switch (state.s_sup82.lp_sup82) {
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = true;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                b = false;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"false\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
                throw new CifSimulatorException("Evaluation of guard \"true\" of an edge of the location of automaton \"sup82\" failed.", e, state);
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
