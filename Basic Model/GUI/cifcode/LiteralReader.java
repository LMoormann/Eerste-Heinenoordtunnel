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

/** Literal reader. */
public final class LiteralReader {
    // int[0..8]
    public static int read0(ClassLoader loader, String path) {
        try {
            try (LiteralStream stream = new LiteralStream(loader, path)) {
                return read0(stream);
            }
        } catch (InputOutputException ex) {
            // Currently literal reading is only used internally,
            // so we expect no exceptions here.
            throw new RuntimeException("Failed to read literal of type \"int[0..8]\".", ex);
        }
    }

    // int[0..8]
    public static int read0(String valueText) {
        try {
            try (LiteralStream stream = new LiteralStream(valueText)) {
                return read0(stream);
            }
        } catch (InputOutputException ex) {
            throw new InputOutputException("Failed to read literal of type \"int[0..8]\".", ex);
        }
    }

    // int[0..8]
    public static int read0(LiteralStream stream) {
        try {
            return read0Internal(stream);
        } catch (InputOutputException ex) {
            throw new InputOutputException("Failed to read literal of type \"int[0..8]\".", ex);
        }
    }

    // int[0..8]
    private static int read0Internal(LiteralStream stream) {
        int rslt = RuntimeLiteralReader.readIntLiteral(stream);
        if (rslt < 0) {
            throw new InputOutputException(fmt("Expected an integer value that is at least 0, but found integer value %d.", rslt));
        }
        if (rslt > 8) {
            throw new InputOutputException(fmt("Expected an integer value that is at most 8, but found integer value %d.", rslt));
        }
        return rslt;
    }
}
