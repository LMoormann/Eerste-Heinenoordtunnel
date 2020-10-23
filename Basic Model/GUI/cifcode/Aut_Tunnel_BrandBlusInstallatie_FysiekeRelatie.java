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

/** Automaton "Tunnel_BrandBlusInstallatie_FysiekeRelatie". */
public final class Aut_Tunnel_BrandBlusInstallatie_FysiekeRelatie extends RuntimeAutomaton<State> {

    @Override
    public String getName() {
        return "Tunnel_BrandBlusInstallatie_FysiekeRelatie";
    }

    @Override
    public int getLocCount() {
        return 1;
    }

    @Override
    public String getCurLocName(State state) {
        return getLocName(state.s_Tunnel_BrandBlusInstallatie_FysiekeRelatie.lp_Tunnel_BrandBlusInstallatie_FysiekeRelatie);
    }

    @Override
    public String getLocName(int locIdx) {
        switch (locIdx) {
            case 0: return "*";
            default: throw new RuntimeException("Invalid loc idx: " + locIdx);
        }
    }

    public static boolean fillSyncData_evt_Tunnel_BrandBlusInstallatie_SensorHoog_u_aan(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(176).get(1);
        rslt.clear();

        switch (state.s_Tunnel_BrandBlusInstallatie_FysiekeRelatie.lp_Tunnel_BrandBlusInstallatie_FysiekeRelatie) {
            case 0:
                if (sync0_0_0.evalGuards(state)) rslt.add(sync0_0_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static boolean fillSyncData_evt_Tunnel_BrandBlusInstallatie_SensorLaag_u_uit(State state) {
        List<RuntimeEdge<State>> rslt = SPEC.syncData.get(179).get(1);
        rslt.clear();

        switch (state.s_Tunnel_BrandBlusInstallatie_FysiekeRelatie.lp_Tunnel_BrandBlusInstallatie_FysiekeRelatie) {
            case 0:
                if (sync0_1_0.evalGuards(state)) rslt.add(sync0_1_0);
                break;
        }

        return !rslt.isEmpty();
    }

    public static void fillTauData(State state) {
        List<RuntimeEdge<State>> edgeData;
        switch (state.s_Tunnel_BrandBlusInstallatie_FysiekeRelatie.lp_Tunnel_BrandBlusInstallatie_FysiekeRelatie) {
        }
    }

    private static final Sync0_0_0 sync0_0_0 = new Sync0_0_0();

    private static final class Sync0_0_0 extends RuntimeSyncEdge<State> {
        @Override
        public boolean evalGuards(State state) {
            boolean b;
            try {
                b = state.s_Tunnel_BrandBlusInstallatie_SensorLaag.lp_Tunnel_BrandBlusInstallatie_SensorLaag == 1;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_BrandBlusInstallatie_SensorLaag.aan\" of an edge of the location of automaton \"Tunnel_BrandBlusInstallatie_FysiekeRelatie\" failed.", e, state);
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
                b = state.s_Tunnel_BrandBlusInstallatie_SensorHoog.lp_Tunnel_BrandBlusInstallatie_SensorHoog == 0;
            } catch (CifSimulatorException e) {
                throw new CifSimulatorException("Evaluation of guard \"Tunnel_BrandBlusInstallatie_SensorHoog.uit\" of an edge of the location of automaton \"Tunnel_BrandBlusInstallatie_FysiekeRelatie\" failed.", e, state);
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
