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

/** Event "Tunnel_Verkeersbuis2_J32_Stand_c_aan". */
public final class Event_Tunnel_Verkeersbuis2_J32_Stand_c_aan extends RuntimeEvent<State> {
    public Event_Tunnel_Verkeersbuis2_J32_Stand_c_aan() {
        super("Tunnel_Verkeersbuis2_J32_Stand_c_aan", 781, true);
    }

    @Override
    public boolean fillData(State state) {
        // Sync.
        boolean proceed;

        // Check automaton "sup48".
        proceed = Aut_sup48.fillSyncData_evt_Tunnel_Verkeersbuis2_J32_Stand_c_aan(state);
        if (!proceed) return false;

        // Check automaton "sup49".
        proceed = Aut_sup49.fillSyncData_evt_Tunnel_Verkeersbuis2_J32_Stand_c_aan(state);
        if (!proceed) return false;

        // Check automaton "sup56".
        proceed = Aut_sup56.fillSyncData_evt_Tunnel_Verkeersbuis2_J32_Stand_c_aan(state);
        if (!proceed) return false;

        // Check automaton "Tunnel_Verkeersbuis2_J32_Stand".
        proceed = Aut_Tunnel_Verkeersbuis2_J32_Stand.fillSyncData_evt_Tunnel_Verkeersbuis2_J32_Stand_c_aan(state);
        if (!proceed) return false;

        // All done, possible so far.
        return true;
    }

    @Override
    public boolean allowedByInvs(State state) {
        // Invariants for "".
        try {
            if (!((((state.s_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_Modus.lp_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_Modus == 0) && ((state.s_Tunnel_Verkeersbuis2_StandVerkeersbuis.lp_Tunnel_Verkeersbuis2_StandVerkeersbuis == 1) || (state.s_Tunnel_Verkeersbuis2_StandVerkeersbuis.lp_Tunnel_Verkeersbuis2_StandVerkeersbuis == 3))) || ((state.s_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_Modus.lp_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_Modus == 1) && ((state.s_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Waarnemer == 1) || (state.s_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Waarnemer == 1)))) || (state.s_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Waarnemer == 1))) return false;
        } catch (CifSimulatorException e) {
            throw new CifSimulatorException("Evaluation of invariant \"Tunnel_Verkeersbuis2_J32_Stand_c_aan needs Tunnel_Verkeersbuis2_BedieningVerkeerslichten_Modus.auto and (Tunnel_Verkeersbuis2_StandVerkeersbuis.calamiteit or Tunnel_Verkeersbuis2_StandVerkeersbuis.ondersteunend) or Tunnel_Verkeersbuis2_BedieningVerkeerslichten_Modus.hand and (Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Waarnemer.ingedrukt or Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Waarnemer.ingedrukt) or Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Waarnemer.ingedrukt\" of the top level scope of the specification failed.", e, state);
        }

        // Invariants for current location.
        switch (state.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond) {
        }

        // Invariants for current location.
        switch (state.s_bevestigde_melding_sos_rechterbuis.lp_bevestigde_melding_sos_rechterbuis) {
        }

        // Invariants for current location.
        switch (state.s_event_disabler.lp_event_disabler) {
        }

        // Invariants for current location.
        switch (state.s_geselecteerde_tab_tab_systemen_en_detecties.lp_geselecteerde_tab_tab_systemen_en_detecties) {
        }

        // Invariants for current location.
        switch (state.s_geselecteerde_tab_verkeer_meldingen.lp_geselecteerde_tab_verkeer_meldingen) {
        }

        // Invariants for current location.
        switch (state.s_lb_bedienmenu_voor_verkeerslichtenstanden.lp_lb_bedienmenu_voor_verkeerslichtenstanden) {
        }

        // Invariants for current location.
        switch (state.s_lb_drop_down_menu_buis_states.lp_lb_drop_down_menu_buis_states) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_blusser.lp_lb_overzicht_systemen_en_detecties_blusser) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_blusvoorziening.lp_lb_overzicht_systemen_en_detecties_blusvoorziening) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_bluswatervoorziening_drop_down_stand.lp_lb_overzicht_systemen_en_detecties_bluswatervoorziening_drop_down_stand) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_buis.lp_lb_overzicht_systemen_en_detecties_buis) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_detecties.lp_lb_overzicht_systemen_en_detecties_detecties) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_deur.lp_lb_overzicht_systemen_en_detecties_deur) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_drop_down_richting_ventilatie.lp_lb_overzicht_systemen_en_detecties_drop_down_richting_ventilatie) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_dynamische_vluchtroute.lp_lb_overzicht_systemen_en_detecties_dynamische_vluchtroute) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand.lp_lb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_haspel.lp_lb_overzicht_systemen_en_detecties_haspel) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_hulppost.lp_lb_overzicht_systemen_en_detecties_hulppost) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_noodtelefoon.lp_lb_overzicht_systemen_en_detecties_noodtelefoon) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte.lp_lb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte_drop_down_stand.lp_lb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte_drop_down_stand) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_overig.lp_lb_overzicht_systemen_en_detecties_overig) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_SOS.lp_lb_overzicht_systemen_en_detecties_SOS) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_tunnel.lp_lb_overzicht_systemen_en_detecties_tunnel) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_ventilatie.lp_lb_overzicht_systemen_en_detecties_ventilatie) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_ventilatie_dropdown_percentage_stand.lp_lb_overzicht_systemen_en_detecties_ventilatie_dropdown_percentage_stand) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_verkeer.lp_lb_overzicht_systemen_en_detecties_verkeer) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_verlichting.lp_lb_overzicht_systemen_en_detecties_verlichting) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_verlichting_dropdown_percentage_stand.lp_lb_overzicht_systemen_en_detecties_verlichting_dropdown_percentage_stand) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte.lp_lb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte_drop_down_stand.lp_lb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte_drop_down_stand) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_vloeistofafvoer.lp_lb_overzicht_systemen_en_detecties_vloeistofafvoer) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_vluchtdeuren.lp_lb_overzicht_systemen_en_detecties_vluchtdeuren) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie.lp_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_contourverlichting_stand.lp_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_contourverlichting_stand) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_geluidsbakens_stand.lp_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_geluidsbakens_stand) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_vluchtroute.lp_lb_overzicht_systemen_en_detecties_vluchtroute) {
        }

        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_VRI_en_afsluitboom.lp_lb_overzicht_systemen_en_detecties_VRI_en_afsluitboom) {
        }

        // Invariants for current location.
        switch (state.s_melding_sos_rechterbuis_geselecteerd.lp_melding_sos_rechterbuis_geselecteerd) {
        }

        // Invariants for current location.
        switch (state.s_openen_en_sluiten_bevestigde_meldingen.lp_openen_en_sluiten_bevestigde_meldingen) {
        }

        // Invariants for current location.
        switch (state.s_overzicht_systemen_en_detecties_drop_down_hoofd_pomp_kelder_1_stand_automaton.lp_overzicht_systemen_en_detecties_drop_down_hoofd_pomp_kelder_1_stand_automaton) {
        }

        // Invariants for current location.
        switch (state.s_overzicht_systemen_en_detecties_drop_down_hoofd_pomp_kelder_2_stand_automaton.lp_overzicht_systemen_en_detecties_drop_down_hoofd_pomp_kelder_2_stand_automaton) {
        }

        // Invariants for current location.
        switch (state.s_overzicht_systemen_en_detecties_drop_down_midden_pomp_kelder_stand_automaton.lp_overzicht_systemen_en_detecties_drop_down_midden_pomp_kelder_stand_automaton) {
        }

        // Invariants for current location.
        switch (state.s_rb_bedienmenu_voor_verkeerslichtenstanden.lp_rb_bedienmenu_voor_verkeerslichtenstanden) {
        }

        // Invariants for current location.
        switch (state.s_rb_drop_down_menu_buis_states.lp_rb_drop_down_menu_buis_states) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_blusser.lp_rb_overzicht_systemen_en_detecties_blusser) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_blusvoorziening.lp_rb_overzicht_systemen_en_detecties_blusvoorziening) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_bluswatervoorziening_drop_down_stand.lp_rb_overzicht_systemen_en_detecties_bluswatervoorziening_drop_down_stand) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_buis.lp_rb_overzicht_systemen_en_detecties_buis) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_detecties.lp_rb_overzicht_systemen_en_detecties_detecties) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_deur.lp_rb_overzicht_systemen_en_detecties_deur) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_drop_down_richting_ventilatie.lp_rb_overzicht_systemen_en_detecties_drop_down_richting_ventilatie) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute.lp_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand.lp_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_haspel.lp_rb_overzicht_systemen_en_detecties_haspel) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_hulppost.lp_rb_overzicht_systemen_en_detecties_hulppost) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_noodtelefoon.lp_rb_overzicht_systemen_en_detecties_noodtelefoon) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte.lp_rb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte_drop_down_stand.lp_rb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte_drop_down_stand) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_overig.lp_rb_overzicht_systemen_en_detecties_overig) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_SOS.lp_rb_overzicht_systemen_en_detecties_SOS) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_tunnel.lp_rb_overzicht_systemen_en_detecties_tunnel) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_ventilatie.lp_rb_overzicht_systemen_en_detecties_ventilatie) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_ventilatie_dropdown_percentage_stand.lp_rb_overzicht_systemen_en_detecties_ventilatie_dropdown_percentage_stand) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_verkeer.lp_rb_overzicht_systemen_en_detecties_verkeer) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_verlichting.lp_rb_overzicht_systemen_en_detecties_verlichting) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_verlichting_dropdown_percentage_stand.lp_rb_overzicht_systemen_en_detecties_verlichting_dropdown_percentage_stand) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte.lp_rb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte_drop_down_stand.lp_rb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte_drop_down_stand) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_vloeistofafvoer.lp_rb_overzicht_systemen_en_detecties_vloeistofafvoer) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_vluchtdeuren.lp_rb_overzicht_systemen_en_detecties_vluchtdeuren) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie.lp_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_contourverlichting_stand.lp_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_contourverlichting_stand) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_geluidsbakens_stand.lp_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_geluidsbakens_stand) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_vluchtroute.lp_rb_overzicht_systemen_en_detecties_vluchtroute) {
        }

        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_VRI_en_afsluitboom.lp_rb_overzicht_systemen_en_detecties_VRI_en_afsluitboom) {
        }

        // Invariants for current location.
        switch (state.s_sup10.lp_sup10) {
        }

        // Invariants for current location.
        switch (state.s_sup15.lp_sup15) {
        }

        // Invariants for current location.
        switch (state.s_sup2.lp_sup2) {
        }

        // Invariants for current location.
        switch (state.s_sup30.lp_sup30) {
        }

        // Invariants for current location.
        switch (state.s_sup31.lp_sup31) {
        }

        // Invariants for current location.
        switch (state.s_sup34.lp_sup34) {
        }

        // Invariants for current location.
        switch (state.s_sup35.lp_sup35) {
        }

        // Invariants for current location.
        switch (state.s_sup38.lp_sup38) {
        }

        // Invariants for current location.
        switch (state.s_sup39.lp_sup39) {
        }

        // Invariants for current location.
        switch (state.s_sup4.lp_sup4) {
        }

        // Invariants for current location.
        switch (state.s_sup41.lp_sup41) {
        }

        // Invariants for current location.
        switch (state.s_sup42.lp_sup42) {
        }

        // Invariants for current location.
        switch (state.s_sup43.lp_sup43) {
        }

        // Invariants for current location.
        switch (state.s_sup44.lp_sup44) {
        }

        // Invariants for current location.
        switch (state.s_sup47.lp_sup47) {
        }

        // Invariants for current location.
        switch (state.s_sup48.lp_sup48) {
        }

        // Invariants for current location.
        switch (state.s_sup49.lp_sup49) {
        }

        // Invariants for current location.
        switch (state.s_sup50.lp_sup50) {
        }

        // Invariants for current location.
        switch (state.s_sup51.lp_sup51) {
        }

        // Invariants for current location.
        switch (state.s_sup56.lp_sup56) {
        }

        // Invariants for current location.
        switch (state.s_sup6.lp_sup6) {
        }

        // Invariants for current location.
        switch (state.s_sup7.lp_sup7) {
        }

        // Invariants for current location.
        switch (state.s_sup71.lp_sup71) {
        }

        // Invariants for current location.
        switch (state.s_sup72.lp_sup72) {
        }

        // Invariants for current location.
        switch (state.s_sup75.lp_sup75) {
        }

        // Invariants for current location.
        switch (state.s_sup76.lp_sup76) {
        }

        // Invariants for current location.
        switch (state.s_sup79.lp_sup79) {
        }

        // Invariants for current location.
        switch (state.s_sup8.lp_sup8) {
        }

        // Invariants for current location.
        switch (state.s_sup80.lp_sup80) {
        }

        // Invariants for current location.
        switch (state.s_sup82.lp_sup82) {
        }

        // Invariants for current location.
        switch (state.s_sup83.lp_sup83) {
        }

        // Invariants for current location.
        switch (state.s_sup84.lp_sup84) {
        }

        // Invariants for current location.
        switch (state.s_sup85.lp_sup85) {
        }

        // Invariants for current location.
        switch (state.s_sup86.lp_sup86) {
        }

        // Invariants for current location.
        switch (state.s_sup88.lp_sup88) {
        }

        // Invariants for current location.
        switch (state.s_sup89.lp_sup89) {
        }

        // Invariants for current location.
        switch (state.s_sup9.lp_sup9) {
        }

        // Invariants for current location.
        switch (state.s_sup92.lp_sup92) {
        }

        // Invariants for current location.
        switch (state.s_sup93.lp_sup93) {
        }

        // Invariants for current location.
        switch (state.s_sup95.lp_sup95) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Bediening_KnopAuto_Knop.lp_Tunnel_BrandBlusInstallatie_Bediening_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Bediening_KnopAuto_Waarnemer.lp_Tunnel_BrandBlusInstallatie_Bediening_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Bediening_KnopHand_Knop.lp_Tunnel_BrandBlusInstallatie_Bediening_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Bediening_KnopHand_Waarnemer.lp_Tunnel_BrandBlusInstallatie_Bediening_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Bediening_Modus.lp_Tunnel_BrandBlusInstallatie_Bediening_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_FysiekeRelatie.lp_Tunnel_BrandBlusInstallatie_FysiekeRelatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_knop_bewaken_Knop.lp_Tunnel_BrandBlusInstallatie_knop_bewaken_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_knop_bewaken_Waarnemer.lp_Tunnel_BrandBlusInstallatie_knop_bewaken_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_knop_blussen_Knop.lp_Tunnel_BrandBlusInstallatie_knop_blussen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_knop_blussen_Waarnemer.lp_Tunnel_BrandBlusInstallatie_knop_blussen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Pomp.lp_Tunnel_BrandBlusInstallatie_Pomp) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Regime.lp_Tunnel_BrandBlusInstallatie_Regime) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_SensorHoog.lp_Tunnel_BrandBlusInstallatie_SensorHoog) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_SensorLaag.lp_Tunnel_BrandBlusInstallatie_SensorLaag) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Bediening_KnopAuto_Knop.lp_Tunnel_HoofdPompkelder1_Bediening_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Bediening_KnopAuto_Waarnemer.lp_Tunnel_HoofdPompkelder1_Bediening_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Bediening_KnopHand_Knop.lp_Tunnel_HoofdPompkelder1_Bediening_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Bediening_KnopHand_Waarnemer.lp_Tunnel_HoofdPompkelder1_Bediening_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Bediening_Modus.lp_Tunnel_HoofdPompkelder1_Bediening_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_KnopBergen_Knop.lp_Tunnel_HoofdPompkelder1_KnopBergen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_KnopBergen_Waarnemer.lp_Tunnel_HoofdPompkelder1_KnopBergen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_KnopLeeghouden_Knop.lp_Tunnel_HoofdPompkelder1_KnopLeeghouden_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_KnopLeeghouden_Waarnemer.lp_Tunnel_HoofdPompkelder1_KnopLeeghouden_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_KnopUit_Knop.lp_Tunnel_HoofdPompkelder1_KnopUit_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_KnopUit_Waarnemer.lp_Tunnel_HoofdPompkelder1_KnopUit_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Pomp1.lp_Tunnel_HoofdPompkelder1_Pomp1) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Pomp2.lp_Tunnel_HoofdPompkelder1_Pomp2) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Regime.lp_Tunnel_HoofdPompkelder1_Regime) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_SensorHooghoogwater.lp_Tunnel_HoofdPompkelder1_SensorHooghoogwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_SensorLaaghoogwater.lp_Tunnel_HoofdPompkelder1_SensorLaaghoogwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_SensorLaagwater.lp_Tunnel_HoofdPompkelder1_SensorLaagwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_SensorMaxstartwater.lp_Tunnel_HoofdPompkelder1_SensorMaxstartwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_SensorStartwater.lp_Tunnel_HoofdPompkelder1_SensorStartwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Bediening_KnopAuto_Knop.lp_Tunnel_HoofdPompkelder2_Bediening_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Bediening_KnopAuto_Waarnemer.lp_Tunnel_HoofdPompkelder2_Bediening_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Bediening_KnopHand_Knop.lp_Tunnel_HoofdPompkelder2_Bediening_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Bediening_KnopHand_Waarnemer.lp_Tunnel_HoofdPompkelder2_Bediening_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Bediening_Modus.lp_Tunnel_HoofdPompkelder2_Bediening_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_KnopBergen_Knop.lp_Tunnel_HoofdPompkelder2_KnopBergen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_KnopBergen_Waarnemer.lp_Tunnel_HoofdPompkelder2_KnopBergen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_KnopLeeghouden_Knop.lp_Tunnel_HoofdPompkelder2_KnopLeeghouden_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_KnopLeeghouden_Waarnemer.lp_Tunnel_HoofdPompkelder2_KnopLeeghouden_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_KnopUit_Knop.lp_Tunnel_HoofdPompkelder2_KnopUit_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_KnopUit_Waarnemer.lp_Tunnel_HoofdPompkelder2_KnopUit_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Pomp1.lp_Tunnel_HoofdPompkelder2_Pomp1) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Pomp2.lp_Tunnel_HoofdPompkelder2_Pomp2) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Regime.lp_Tunnel_HoofdPompkelder2_Regime) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_SensorHooghoogwater.lp_Tunnel_HoofdPompkelder2_SensorHooghoogwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_SensorLaaghoogwater.lp_Tunnel_HoofdPompkelder2_SensorLaaghoogwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_SensorLaagwater.lp_Tunnel_HoofdPompkelder2_SensorLaagwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_SensorMaxstartwater.lp_Tunnel_HoofdPompkelder2_SensorMaxstartwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_SensorStartwater.lp_Tunnel_HoofdPompkelder2_SensorStartwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Knop.lp_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Waarnemer.lp_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Bediening_KnopHand_Knop.lp_Tunnel_MiddenPompkelder_Bediening_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Bediening_KnopHand_Waarnemer.lp_Tunnel_MiddenPompkelder_Bediening_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Bediening_Modus.lp_Tunnel_MiddenPompkelder_Bediening_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_FysiekeRelatie.lp_Tunnel_MiddenPompkelder_FysiekeRelatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_KnopBergen_Knop.lp_Tunnel_MiddenPompkelder_KnopBergen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_KnopBergen_Waarnemer.lp_Tunnel_MiddenPompkelder_KnopBergen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_KnopLeeghouden_Knop.lp_Tunnel_MiddenPompkelder_KnopLeeghouden_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_KnopLeeghouden_Waarnemer.lp_Tunnel_MiddenPompkelder_KnopLeeghouden_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_KnopUit_Knop.lp_Tunnel_MiddenPompkelder_KnopUit_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_KnopUit_Waarnemer.lp_Tunnel_MiddenPompkelder_KnopUit_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Pomp1.lp_Tunnel_MiddenPompkelder_Pomp1) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Pomp2.lp_Tunnel_MiddenPompkelder_Pomp2) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_PompRichting.lp_Tunnel_MiddenPompkelder_PompRichting) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Regime.lp_Tunnel_MiddenPompkelder_Regime) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_SensorHooghoogwater.lp_Tunnel_MiddenPompkelder_SensorHooghoogwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_SensorLaaghoogwater.lp_Tunnel_MiddenPompkelder_SensorLaaghoogwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_SensorLaagwater.lp_Tunnel_MiddenPompkelder_SensorLaagwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_SensorMaxstartwater.lp_Tunnel_MiddenPompkelder_SensorMaxstartwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_SensorStartwater.lp_Tunnel_MiddenPompkelder_SensorStartwater) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Knop.lp_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Knop.lp_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_Modus.lp_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Knop.lp_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Knop.lp_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_Modus.lp_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopAuto_Knop.lp_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopAuto_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopHand_Knop.lp_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopHand_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_Modus.lp_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_DynamischeVluchtrouteIndicatie.lp_Tunnel_MiddenTunnelKanaal_DynamischeVluchtrouteIndicatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopVerlichtingAan_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopVerlichtingAan_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopVerlichtingAan_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopVerlichtingAan_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopVerlichtingUit_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopVerlichtingUit_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopVerlichtingUit_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopVerlichtingUit_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_Luidspreker.lp_Tunnel_MiddenTunnelKanaal_Luidspreker) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_Overdruk.lp_Tunnel_MiddenTunnelKanaal_Overdruk) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_Verlichting.lp_Tunnel_MiddenTunnelKanaal_Verlichting) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom1_ActuatorNeer.lp_Tunnel_Verkeersbuis1_Afsluitboom1_ActuatorNeer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom1_ActuatorOp.lp_Tunnel_Verkeersbuis1_Afsluitboom1_ActuatorOp) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom1_FysiekeRelatie.lp_Tunnel_Verkeersbuis1_Afsluitboom1_FysiekeRelatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom1_ObstakelDetectie.lp_Tunnel_Verkeersbuis1_Afsluitboom1_ObstakelDetectie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom1_SensorDicht.lp_Tunnel_Verkeersbuis1_Afsluitboom1_SensorDicht) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom1_SensorOpen.lp_Tunnel_Verkeersbuis1_Afsluitboom1_SensorOpen) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom2_ActuatorNeer.lp_Tunnel_Verkeersbuis1_Afsluitboom2_ActuatorNeer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom2_ActuatorOp.lp_Tunnel_Verkeersbuis1_Afsluitboom2_ActuatorOp) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom2_FysiekeRelatie.lp_Tunnel_Verkeersbuis1_Afsluitboom2_FysiekeRelatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom2_ObstakelDetectie.lp_Tunnel_Verkeersbuis1_Afsluitboom2_ObstakelDetectie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom2_SensorDicht.lp_Tunnel_Verkeersbuis1_Afsluitboom2_SensorDicht) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom2_SensorOpen.lp_Tunnel_Verkeersbuis1_Afsluitboom2_SensorOpen) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopAuto_Knop.lp_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopHand_Knop.lp_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_Modus.lp_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopAuto_Knop.lp_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopHand_Knop.lp_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVentilatie_Modus.lp_Tunnel_Verkeersbuis1_BedieningVentilatie_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopAuto_Knop.lp_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopHand_Knop.lp_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_Modus.lp_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopAuto_Knop.lp_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopHand_Knop.lp_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerlichting_Modus.lp_Tunnel_Verkeersbuis1_BedieningVerlichting_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Evacuatie.lp_Tunnel_Verkeersbuis1_Evacuatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastA_Brandslang.lp_Tunnel_Verkeersbuis1_HulppostkastA_Brandslang) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastA_Handblusser.lp_Tunnel_Verkeersbuis1_HulppostkastA_Handblusser) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastA_Noodtelefoon.lp_Tunnel_Verkeersbuis1_HulppostkastA_Noodtelefoon) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastA_SensorOpen.lp_Tunnel_Verkeersbuis1_HulppostkastA_SensorOpen) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastC_Handblusser.lp_Tunnel_Verkeersbuis1_HulppostkastC_Handblusser) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastC_Noodtelefoon.lp_Tunnel_Verkeersbuis1_HulppostkastC_Noodtelefoon) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastC_SensorOpen.lp_Tunnel_Verkeersbuis1_HulppostkastC_SensorOpen) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_J32_Stand.lp_Tunnel_Verkeersbuis1_J32_Stand) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_J32_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis1_J32_TimerVrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCalamiteit_Knop.lp_Tunnel_Verkeersbuis1_KnopCalamiteit_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCalamiteit_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCalamiteit_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera1_Knop.lp_Tunnel_Verkeersbuis1_KnopCamera1_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera1_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCamera1_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera2_Knop.lp_Tunnel_Verkeersbuis1_KnopCamera2_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera2_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCamera2_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera3_Knop.lp_Tunnel_Verkeersbuis1_KnopCamera3_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera3_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCamera3_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera4_Knop.lp_Tunnel_Verkeersbuis1_KnopCamera4_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera4_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCamera4_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera5_Knop.lp_Tunnel_Verkeersbuis1_KnopCamera5_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera5_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCamera5_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera6_Knop.lp_Tunnel_Verkeersbuis1_KnopCamera6_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera6_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCamera6_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopEvacuatie_Knop.lp_Tunnel_Verkeersbuis1_KnopEvacuatie_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopEvacuatie_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopEvacuatie_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopHerstel_Knop.lp_Tunnel_Verkeersbuis1_KnopHerstel_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopHerstel_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopHerstel_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopKnipperVerkeerslichten_Knop.lp_Tunnel_Verkeersbuis1_KnopKnipperVerkeerslichten_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopKnipperVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopKnipperVerkeerslichten_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOnderhoud_Knop.lp_Tunnel_Verkeersbuis1_KnopOnderhoud_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOnderhoud_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopOnderhoud_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOpenAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis1_KnopOpenAfsluitbomen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOpenAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopOpenAfsluitbomen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Knop.lp_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOperationeel_Knop.lp_Tunnel_Verkeersbuis1_KnopOperationeel_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOperationeel_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopOperationeel_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopRoodVerkeerslichten_Knop.lp_Tunnel_Verkeersbuis1_KnopRoodVerkeerslichten_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopRoodVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopRoodVerkeerslichten_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopSluitAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis1_KnopSluitAfsluitbomen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopSluitAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopSluitAfsluitbomen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Knop.lp_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStartBoodschap_Knop.lp_Tunnel_Verkeersbuis1_KnopStartBoodschap_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStartBoodschap_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopStartBoodschap_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStartLive_Knop.lp_Tunnel_Verkeersbuis1_KnopStartLive_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStartLive_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopStartLive_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStopAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis1_KnopStopAfsluitbomen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStopAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopStopAfsluitbomen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStopBoodschap_Knop.lp_Tunnel_Verkeersbuis1_KnopStopBoodschap_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStopBoodschap_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopStopBoodschap_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStopLive_Knop.lp_Tunnel_Verkeersbuis1_KnopStopLive_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStopLive_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopStopLive_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopUitVerkeerslichten_Knop.lp_Tunnel_Verkeersbuis1_KnopUitVerkeerslichten_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopUitVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopUitVerkeerslichten_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie0_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie0_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie0_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie0_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie1_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie1_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie1_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie1_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie2_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie2_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie2_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie2_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie3_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie3_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie3_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie3_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie4_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie4_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie4_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie4_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie5_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie5_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie5_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie5_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie6_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie6_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie6_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie6_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie7_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie7_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie7_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie7_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie8_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie8_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie8_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie8_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting0_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting0_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting0_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting0_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting1_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting1_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting1_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting1_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting2_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting2_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting2_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting2_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting3_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting3_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting3_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting3_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting4_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting4_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting4_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting4_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting5_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting5_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting5_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting5_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting6_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting6_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting6_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting6_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting7_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting7_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting7_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting7_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting8_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting8_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting8_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting8_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Lichtsensor.lp_Tunnel_Verkeersbuis1_Lichtsensor) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Luidspreker.lp_Tunnel_Verkeersbuis1_Luidspreker) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_MatrixbordLos.lp_Tunnel_Verkeersbuis1_MatrixbordLos) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_MatrixbordVerkeerslicht.lp_Tunnel_Verkeersbuis1_MatrixbordVerkeerslicht) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Onderhoud.lp_Tunnel_Verkeersbuis1_Onderhoud) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Knop.lp_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Waarnemer.lp_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Knop.lp_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Waarnemer.lp_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_Relatie.lp_Tunnel_Verkeersbuis1_PopUp_Relatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_Timer.lp_Tunnel_Verkeersbuis1_PopUp_Timer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_Venster.lp_Tunnel_Verkeersbuis1_PopUp_Venster) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Recorder.lp_Tunnel_Verkeersbuis1_Recorder) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Rookdetectie.lp_Tunnel_Verkeersbuis1_Rookdetectie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_SOS.lp_Tunnel_Verkeersbuis1_SOS) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Standby.lp_Tunnel_Verkeersbuis1_Standby) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_StandVerkeersbuis.lp_Tunnel_Verkeersbuis1_StandVerkeersbuis) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_VentilatieIngang.lp_Tunnel_Verkeersbuis1_VentilatieIngang) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_VentilatieRichting.lp_Tunnel_Verkeersbuis1_VentilatieRichting) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht1_Relatie.lp_Tunnel_Verkeersbuis1_Verkeerslicht1_Relatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht1_Stand.lp_Tunnel_Verkeersbuis1_Verkeerslicht1_Stand) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht1_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis1_Verkeerslicht1_TimerVrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht1_Vrijgavesignaal.lp_Tunnel_Verkeersbuis1_Verkeerslicht1_Vrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht2_Relatie.lp_Tunnel_Verkeersbuis1_Verkeerslicht2_Relatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht2_Stand.lp_Tunnel_Verkeersbuis1_Verkeerslicht2_Stand) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht2_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis1_Verkeerslicht2_TimerVrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht2_Vrijgavesignaal.lp_Tunnel_Verkeersbuis1_Verkeerslicht2_Vrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht3_Relatie.lp_Tunnel_Verkeersbuis1_Verkeerslicht3_Relatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht3_Stand.lp_Tunnel_Verkeersbuis1_Verkeerslicht3_Stand) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht3_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis1_Verkeerslicht3_TimerVrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht3_Vrijgavesignaal.lp_Tunnel_Verkeersbuis1_Verkeerslicht3_Vrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verlichting.lp_Tunnel_Verkeersbuis1_Verlichting) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_Modus.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_Modus.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_ContourVerlichting.lp_Tunnel_Verkeersbuis1_Vluchtdeur_ContourVerlichting) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_Geluidsbaken.lp_Tunnel_Verkeersbuis1_Vluchtdeur_Geluidsbaken) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_SensorOpen.lp_Tunnel_Verkeersbuis1_Vluchtdeur_SensorOpen) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_WisselTimerAudio.lp_Tunnel_Verkeersbuis1_WisselTimerAudio) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom1_ActuatorNeer.lp_Tunnel_Verkeersbuis2_Afsluitboom1_ActuatorNeer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom1_ActuatorOp.lp_Tunnel_Verkeersbuis2_Afsluitboom1_ActuatorOp) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom1_FysiekeRelatie.lp_Tunnel_Verkeersbuis2_Afsluitboom1_FysiekeRelatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom1_ObstakelDetectie.lp_Tunnel_Verkeersbuis2_Afsluitboom1_ObstakelDetectie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom1_SensorDicht.lp_Tunnel_Verkeersbuis2_Afsluitboom1_SensorDicht) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom1_SensorOpen.lp_Tunnel_Verkeersbuis2_Afsluitboom1_SensorOpen) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom2_ActuatorNeer.lp_Tunnel_Verkeersbuis2_Afsluitboom2_ActuatorNeer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom2_ActuatorOp.lp_Tunnel_Verkeersbuis2_Afsluitboom2_ActuatorOp) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom2_FysiekeRelatie.lp_Tunnel_Verkeersbuis2_Afsluitboom2_FysiekeRelatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom2_ObstakelDetectie.lp_Tunnel_Verkeersbuis2_Afsluitboom2_ObstakelDetectie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom2_SensorDicht.lp_Tunnel_Verkeersbuis2_Afsluitboom2_SensorDicht) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom2_SensorOpen.lp_Tunnel_Verkeersbuis2_Afsluitboom2_SensorOpen) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopAuto_Knop.lp_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopHand_Knop.lp_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_Modus.lp_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopAuto_Knop.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopHand_Knop.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_Modus.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopAuto_Knop.lp_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopHand_Knop.lp_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_Modus.lp_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopAuto_Knop.lp_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopHand_Knop.lp_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerlichting_Modus.lp_Tunnel_Verkeersbuis2_BedieningVerlichting_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Evacuatie.lp_Tunnel_Verkeersbuis2_Evacuatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastA_Brandslang.lp_Tunnel_Verkeersbuis2_HulppostkastA_Brandslang) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastA_Handblusser.lp_Tunnel_Verkeersbuis2_HulppostkastA_Handblusser) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastA_Noodtelefoon.lp_Tunnel_Verkeersbuis2_HulppostkastA_Noodtelefoon) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastA_SensorOpen.lp_Tunnel_Verkeersbuis2_HulppostkastA_SensorOpen) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastC_Handblusser.lp_Tunnel_Verkeersbuis2_HulppostkastC_Handblusser) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastC_Noodtelefoon.lp_Tunnel_Verkeersbuis2_HulppostkastC_Noodtelefoon) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastC_SensorOpen.lp_Tunnel_Verkeersbuis2_HulppostkastC_SensorOpen) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_J32_Stand.lp_Tunnel_Verkeersbuis2_J32_Stand) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_J32_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_J32_TimerVrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Kanaal.lp_Tunnel_Verkeersbuis2_Kanaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCalamiteit_Knop.lp_Tunnel_Verkeersbuis2_KnopCalamiteit_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCalamiteit_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCalamiteit_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera1_Knop.lp_Tunnel_Verkeersbuis2_KnopCamera1_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera1_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCamera1_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera2_Knop.lp_Tunnel_Verkeersbuis2_KnopCamera2_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera2_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCamera2_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera3_Knop.lp_Tunnel_Verkeersbuis2_KnopCamera3_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera3_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCamera3_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera4_Knop.lp_Tunnel_Verkeersbuis2_KnopCamera4_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera4_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCamera4_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera5_Knop.lp_Tunnel_Verkeersbuis2_KnopCamera5_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera5_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCamera5_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera6_Knop.lp_Tunnel_Verkeersbuis2_KnopCamera6_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera6_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCamera6_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopEvacuatie_Knop.lp_Tunnel_Verkeersbuis2_KnopEvacuatie_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopEvacuatie_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopEvacuatie_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopHerstel_Knop.lp_Tunnel_Verkeersbuis2_KnopHerstel_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopHerstel_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopHerstel_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Knop.lp_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOnderhoud_Knop.lp_Tunnel_Verkeersbuis2_KnopOnderhoud_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOnderhoud_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopOnderhoud_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOpenAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis2_KnopOpenAfsluitbomen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOpenAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopOpenAfsluitbomen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Knop.lp_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOperationeel_Knop.lp_Tunnel_Verkeersbuis2_KnopOperationeel_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOperationeel_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopOperationeel_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Knop.lp_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopSluitAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis2_KnopSluitAfsluitbomen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopSluitAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopSluitAfsluitbomen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Knop.lp_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStartBoodschap_Knop.lp_Tunnel_Verkeersbuis2_KnopStartBoodschap_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStartBoodschap_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopStartBoodschap_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStartLive_Knop.lp_Tunnel_Verkeersbuis2_KnopStartLive_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStartLive_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopStartLive_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStopAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis2_KnopStopAfsluitbomen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStopAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopStopAfsluitbomen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStopBoodschap_Knop.lp_Tunnel_Verkeersbuis2_KnopStopBoodschap_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStopBoodschap_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopStopBoodschap_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStopLive_Knop.lp_Tunnel_Verkeersbuis2_KnopStopLive_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStopLive_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopStopLive_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopUitVerkeerslichten_Knop.lp_Tunnel_Verkeersbuis2_KnopUitVerkeerslichten_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopUitVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopUitVerkeerslichten_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie0_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie0_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie0_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie0_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie1_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie1_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie1_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie1_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie2_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie2_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie2_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie2_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie3_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie3_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie3_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie3_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie4_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie4_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie4_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie4_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie5_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie5_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie5_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie5_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie6_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie6_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie6_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie6_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie7_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie7_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie7_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie7_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie8_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting0_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting0_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting0_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting0_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting1_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting1_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting1_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting1_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting2_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting2_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting2_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting2_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting3_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting3_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting3_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting3_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting4_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting4_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting4_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting4_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting5_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting5_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting5_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting5_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting6_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting6_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting6_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting6_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting7_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting7_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting7_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting7_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting8_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting8_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting8_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting8_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Lichtsensor.lp_Tunnel_Verkeersbuis2_Lichtsensor) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Luidspreker.lp_Tunnel_Verkeersbuis2_Luidspreker) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_MatrixbordLos.lp_Tunnel_Verkeersbuis2_MatrixbordLos) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_MatrixbordVerkeerslicht.lp_Tunnel_Verkeersbuis2_MatrixbordVerkeerslicht) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Onderhoud.lp_Tunnel_Verkeersbuis2_Onderhoud) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Knop.lp_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Waarnemer.lp_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Knop.lp_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Waarnemer.lp_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_Relatie.lp_Tunnel_Verkeersbuis2_PopUp_Relatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_Timer.lp_Tunnel_Verkeersbuis2_PopUp_Timer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_Venster.lp_Tunnel_Verkeersbuis2_PopUp_Venster) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Recorder.lp_Tunnel_Verkeersbuis2_Recorder) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Rookdetectie.lp_Tunnel_Verkeersbuis2_Rookdetectie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_SOS.lp_Tunnel_Verkeersbuis2_SOS) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Standby.lp_Tunnel_Verkeersbuis2_Standby) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_StandVerkeersbuis.lp_Tunnel_Verkeersbuis2_StandVerkeersbuis) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Ventilatie.lp_Tunnel_Verkeersbuis2_Ventilatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_VentilatieIngang.lp_Tunnel_Verkeersbuis2_VentilatieIngang) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_VentilatieRichting.lp_Tunnel_Verkeersbuis2_VentilatieRichting) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht1_Relatie.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_Relatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht1_Stand.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_Stand) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht1_Vrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_Vrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht2_Relatie.lp_Tunnel_Verkeersbuis2_Verkeerslicht2_Relatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht2_Stand.lp_Tunnel_Verkeersbuis2_Verkeerslicht2_Stand) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht2_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht2_TimerVrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht2_Vrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht2_Vrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht3_Relatie.lp_Tunnel_Verkeersbuis2_Verkeerslicht3_Relatie) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht3_Stand.lp_Tunnel_Verkeersbuis2_Verkeerslicht3_Stand) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht3_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht3_TimerVrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht3_Vrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht3_Vrijgavesignaal) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verlichting.lp_Tunnel_Verkeersbuis2_Verlichting) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopHand_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_Modus.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_Modus.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_Modus) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_ContourVerlichting.lp_Tunnel_Verkeersbuis2_Vluchtdeur_ContourVerlichting) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_Geluidsbaken.lp_Tunnel_Verkeersbuis2_Vluchtdeur_Geluidsbaken) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingAan_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingAan_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingUit_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingUit_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Knop) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_SensorOpen.lp_Tunnel_Verkeersbuis2_Vluchtdeur_SensorOpen) {
        }

        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_WisselTimerAudio.lp_Tunnel_Verkeersbuis2_WisselTimerAudio) {
        }

        // Event allowed by invariants.
        return true;
    }
}
