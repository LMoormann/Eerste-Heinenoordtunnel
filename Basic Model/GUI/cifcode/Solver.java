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

/** Runtime ODE solver. */
public final class Solver extends OdeSolver<State> {
    private static Solver SOLVER;

    public static String[] CONT_VAR_NAMES = {
        "<dummy>",
    };

    public Solver() {
        super(true);
    }

    public static Solver getSolver() {
        if (SOLVER == null) SOLVER = new Solver();
        return SOLVER;
    }

    @Override
    protected double[] initY(State state) {
        double[] y = new double[1];
        y[0] = 0.0; // dummy variable
        return y;
    }

    @Override
    public void checkValues(double time, double[] values) {
        if (!isValidValue(time)) throwValueError(time, "time");
    }

    @Override
    public int getDimension() {
        return 1;
    }

    @Override
    protected String getContVarName(int idx) {
        return CONT_VAR_NAMES[idx];
    }

    @Override
    public State makeState(State state, double t, double[] y, boolean copy) {
        State rslt = copy ? State.copy(state) : state;
        if (copy) rslt.s = rslt.s.copy();
        rslt.s.time = t;
        return rslt;
    }

    @Override
    protected void computeDerivatives(State state, double[] yDot) {
        yDot[0] = 1.0; // dummy variable
    }
}
