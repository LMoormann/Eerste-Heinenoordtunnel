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

/** Runtime sub-state for automaton "rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand". */
public final class StateAut_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand {
    public int lp_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand;

    public StateAut_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand copy() {
        StateAut_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand rslt = new StateAut_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand();
        rslt.lp_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand = lp_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand;
        return rslt;
    }
}