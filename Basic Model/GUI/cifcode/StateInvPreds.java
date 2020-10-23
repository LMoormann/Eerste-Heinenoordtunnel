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

/** State invariants. */
public final class StateInvPreds {
    public static boolean evalStateInvPreds(State state, boolean initial) {
        // Invariants for current locations of automata.
        if (!evalStateInvPredsAut_besturing_selectie_tunneldeel_detailplattegrond(state, initial)) return false;
        if (!evalStateInvPredsAut_bevestigde_melding_sos_rechterbuis(state, initial)) return false;
        if (!evalStateInvPredsAut_event_disabler(state, initial)) return false;
        if (!evalStateInvPredsAut_geselecteerde_tab_tab_systemen_en_detecties(state, initial)) return false;
        if (!evalStateInvPredsAut_geselecteerde_tab_verkeer_meldingen(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_bedienmenu_voor_verkeerslichtenstanden(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_drop_down_menu_buis_states(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_blusser(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_blusvoorziening(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_bluswatervoorziening_drop_down_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_buis(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_detecties(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_deur(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_drop_down_richting_ventilatie(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_dynamische_vluchtroute(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_haspel(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_hulppost(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_noodtelefoon(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte_drop_down_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_overig(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_SOS(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_tunnel(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_ventilatie(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_ventilatie_dropdown_percentage_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_verkeer(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_verlichting(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_verlichting_dropdown_percentage_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte_drop_down_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_vloeistofafvoer(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_vluchtdeuren(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_contourverlichting_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_geluidsbakens_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_vluchtroute(state, initial)) return false;
        if (!evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_VRI_en_afsluitboom(state, initial)) return false;
        if (!evalStateInvPredsAut_melding_sos_rechterbuis_geselecteerd(state, initial)) return false;
        if (!evalStateInvPredsAut_openen_en_sluiten_bevestigde_meldingen(state, initial)) return false;
        if (!evalStateInvPredsAut_overzicht_systemen_en_detecties_drop_down_hoofd_pomp_kelder_1_stand_automaton(state, initial)) return false;
        if (!evalStateInvPredsAut_overzicht_systemen_en_detecties_drop_down_hoofd_pomp_kelder_2_stand_automaton(state, initial)) return false;
        if (!evalStateInvPredsAut_overzicht_systemen_en_detecties_drop_down_midden_pomp_kelder_stand_automaton(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_bedienmenu_voor_verkeerslichtenstanden(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_drop_down_menu_buis_states(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_blusser(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_blusvoorziening(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_bluswatervoorziening_drop_down_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_buis(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_detecties(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_deur(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_drop_down_richting_ventilatie(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_haspel(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_hulppost(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_noodtelefoon(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte_drop_down_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_overig(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_SOS(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_tunnel(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_ventilatie(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_ventilatie_dropdown_percentage_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_verkeer(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_verlichting(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_verlichting_dropdown_percentage_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte_drop_down_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_vloeistofafvoer(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_vluchtdeuren(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_contourverlichting_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_geluidsbakens_stand(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_vluchtroute(state, initial)) return false;
        if (!evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_VRI_en_afsluitboom(state, initial)) return false;
        if (!evalStateInvPredsAut_sup10(state, initial)) return false;
        if (!evalStateInvPredsAut_sup15(state, initial)) return false;
        if (!evalStateInvPredsAut_sup2(state, initial)) return false;
        if (!evalStateInvPredsAut_sup30(state, initial)) return false;
        if (!evalStateInvPredsAut_sup31(state, initial)) return false;
        if (!evalStateInvPredsAut_sup34(state, initial)) return false;
        if (!evalStateInvPredsAut_sup35(state, initial)) return false;
        if (!evalStateInvPredsAut_sup38(state, initial)) return false;
        if (!evalStateInvPredsAut_sup39(state, initial)) return false;
        if (!evalStateInvPredsAut_sup4(state, initial)) return false;
        if (!evalStateInvPredsAut_sup41(state, initial)) return false;
        if (!evalStateInvPredsAut_sup42(state, initial)) return false;
        if (!evalStateInvPredsAut_sup43(state, initial)) return false;
        if (!evalStateInvPredsAut_sup44(state, initial)) return false;
        if (!evalStateInvPredsAut_sup47(state, initial)) return false;
        if (!evalStateInvPredsAut_sup48(state, initial)) return false;
        if (!evalStateInvPredsAut_sup49(state, initial)) return false;
        if (!evalStateInvPredsAut_sup50(state, initial)) return false;
        if (!evalStateInvPredsAut_sup51(state, initial)) return false;
        if (!evalStateInvPredsAut_sup56(state, initial)) return false;
        if (!evalStateInvPredsAut_sup6(state, initial)) return false;
        if (!evalStateInvPredsAut_sup7(state, initial)) return false;
        if (!evalStateInvPredsAut_sup71(state, initial)) return false;
        if (!evalStateInvPredsAut_sup72(state, initial)) return false;
        if (!evalStateInvPredsAut_sup75(state, initial)) return false;
        if (!evalStateInvPredsAut_sup76(state, initial)) return false;
        if (!evalStateInvPredsAut_sup79(state, initial)) return false;
        if (!evalStateInvPredsAut_sup8(state, initial)) return false;
        if (!evalStateInvPredsAut_sup80(state, initial)) return false;
        if (!evalStateInvPredsAut_sup82(state, initial)) return false;
        if (!evalStateInvPredsAut_sup83(state, initial)) return false;
        if (!evalStateInvPredsAut_sup84(state, initial)) return false;
        if (!evalStateInvPredsAut_sup85(state, initial)) return false;
        if (!evalStateInvPredsAut_sup86(state, initial)) return false;
        if (!evalStateInvPredsAut_sup88(state, initial)) return false;
        if (!evalStateInvPredsAut_sup89(state, initial)) return false;
        if (!evalStateInvPredsAut_sup9(state, initial)) return false;
        if (!evalStateInvPredsAut_sup92(state, initial)) return false;
        if (!evalStateInvPredsAut_sup93(state, initial)) return false;
        if (!evalStateInvPredsAut_sup95(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Bediening_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Bediening_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Bediening_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Bediening_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Bediening_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_FysiekeRelatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_knop_bewaken_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_knop_bewaken_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_knop_blussen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_knop_blussen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Pomp(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Regime(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_SensorHoog(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_SensorLaag(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Bediening_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Bediening_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Bediening_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Bediening_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Bediening_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_FysiekeRelatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_KnopBergen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_KnopBergen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_KnopLeeghouden_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_KnopLeeghouden_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_KnopUit_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_KnopUit_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Pomp1(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Pomp2(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Regime(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_SensorHooghoogwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_SensorLaaghoogwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_SensorLaagwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_SensorMaxstartwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder1_SensorStartwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Bediening_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Bediening_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Bediening_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Bediening_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Bediening_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_FysiekeRelatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_KnopBergen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_KnopBergen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_KnopLeeghouden_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_KnopLeeghouden_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_KnopUit_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_KnopUit_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Pomp1(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Pomp2(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Regime(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_SensorHooghoogwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_SensorLaaghoogwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_SensorLaagwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_SensorMaxstartwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_HoofdPompkelder2_SensorStartwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_Bediening_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_Bediening_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_Bediening_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_FysiekeRelatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_KnopBergen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_KnopBergen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_KnopLeeghouden_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_KnopLeeghouden_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_KnopUit_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_KnopUit_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_Pomp1(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_Pomp2(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_PompRichting(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_Regime(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_SensorHooghoogwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_SensorLaaghoogwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_SensorLaagwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_SensorMaxstartwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenPompkelder_SensorStartwater(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_DynamischeVluchtrouteIndicatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopVerlichtingAan_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopVerlichtingAan_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopVerlichtingUit_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopVerlichtingUit_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_Luidspreker(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_Overdruk(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_Verlichting(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom1_ActuatorNeer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom1_ActuatorOp(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom1_FysiekeRelatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom1_ObstakelDetectie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom1_SensorDicht(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom1_SensorOpen(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom2_ActuatorNeer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom2_ActuatorOp(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom2_FysiekeRelatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom2_ObstakelDetectie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom2_SensorDicht(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom2_SensorOpen(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVentilatie_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerlichting_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Evacuatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastA_Brandslang(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastA_Handblusser(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastA_Noodtelefoon(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastA_SensorOpen(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastC_Handblusser(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastC_Noodtelefoon(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastC_SensorOpen(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_J32_Stand(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_J32_TimerVrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Kanaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCalamiteit_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCalamiteit_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera1_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera1_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera2_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera2_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera3_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera3_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera4_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera4_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera5_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera5_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera6_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera6_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopEvacuatie_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopEvacuatie_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopHerstel_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopHerstel_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopKnipperVerkeerslichten_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopKnipperVerkeerslichten_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOnderhoud_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOnderhoud_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOpenAfsluitbomen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOpenAfsluitbomen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOperationeel_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOperationeel_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopRoodVerkeerslichten_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopRoodVerkeerslichten_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopSluitAfsluitbomen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopSluitAfsluitbomen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStartBoodschap_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStartBoodschap_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStartLive_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStartLive_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStopAfsluitbomen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStopAfsluitbomen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStopBoodschap_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStopBoodschap_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStopLive_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStopLive_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopUitVerkeerslichten_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopUitVerkeerslichten_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie0_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie0_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie1_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie1_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie2_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie2_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie3_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie3_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie4_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie4_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie5_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie5_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie6_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie6_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie7_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie7_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie8_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie8_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting0_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting0_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting1_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting1_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting2_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting2_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting3_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting3_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting4_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting4_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting5_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting5_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting6_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting6_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting7_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting7_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting8_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting8_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Lichtsensor(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Luidspreker(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_MatrixbordLos(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_MatrixbordVerkeerslicht(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Onderhoud(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_Relatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_Timer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_Venster(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Recorder(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Rookdetectie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_SOS(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Standby(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_StandVerkeersbuis(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Ventilatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_VentilatieIngang(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_VentilatieRichting(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht1_Relatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht1_Stand(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht1_TimerVrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht1_Vrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht2_Relatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht2_Stand(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht2_TimerVrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht2_Vrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht3_Relatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht3_Stand(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht3_TimerVrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht3_Vrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verlichting(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_ContourVerlichting(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_Geluidsbaken(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_SensorOpen(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis1_WisselTimerAudio(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom1_ActuatorNeer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom1_ActuatorOp(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom1_FysiekeRelatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom1_ObstakelDetectie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom1_SensorDicht(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom1_SensorOpen(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom2_ActuatorNeer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom2_ActuatorOp(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom2_FysiekeRelatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom2_ObstakelDetectie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom2_SensorDicht(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom2_SensorOpen(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVentilatie_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerlichting_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Evacuatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastA_Brandslang(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastA_Handblusser(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastA_Noodtelefoon(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastA_SensorOpen(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastC_Handblusser(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastC_Noodtelefoon(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastC_SensorOpen(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_J32_Stand(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_J32_TimerVrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Kanaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCalamiteit_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCalamiteit_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera1_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera1_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera2_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera2_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera3_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera3_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera4_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera4_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera5_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera5_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera6_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera6_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopEvacuatie_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopEvacuatie_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopHerstel_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopHerstel_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOnderhoud_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOnderhoud_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOpenAfsluitbomen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOpenAfsluitbomen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOperationeel_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOperationeel_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopSluitAfsluitbomen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopSluitAfsluitbomen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStartBoodschap_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStartBoodschap_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStartLive_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStartLive_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStopAfsluitbomen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStopAfsluitbomen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStopBoodschap_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStopBoodschap_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStopLive_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStopLive_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopUitVerkeerslichten_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopUitVerkeerslichten_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie0_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie0_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie1_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie1_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie2_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie2_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie3_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie3_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie4_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie4_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie5_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie5_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie6_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie6_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie7_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie7_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie8_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting0_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting0_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting1_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting1_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting2_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting2_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting3_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting3_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting4_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting4_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting5_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting5_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting6_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting6_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting7_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting7_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting8_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting8_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Lichtsensor(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Luidspreker(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_MatrixbordLos(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_MatrixbordVerkeerslicht(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Onderhoud(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_Relatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_Timer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_Venster(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Recorder(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Rookdetectie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_SOS(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Standby(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_StandVerkeersbuis(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Ventilatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_VentilatieIngang(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_VentilatieRichting(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht1_Relatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht1_Stand(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht1_Vrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht2_Relatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht2_Stand(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht2_TimerVrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht2_Vrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht3_Relatie(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht3_Stand(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht3_TimerVrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht3_Vrijgavesignaal(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verlichting(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_Modus(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_ContourVerlichting(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_Geluidsbaken(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingAan_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingUit_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Knop(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_SensorOpen(state, initial)) return false;
        if (!evalStateInvPredsAut_Tunnel_Verkeersbuis2_WisselTimerAudio(state, initial)) return false;

        // All invariant predicates satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_besturing_selectie_tunneldeel_detailplattegrond(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_besturing_selectie_tunneldeel_detailplattegrond.lp_besturing_selectie_tunneldeel_detailplattegrond) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_bevestigde_melding_sos_rechterbuis(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_bevestigde_melding_sos_rechterbuis.lp_bevestigde_melding_sos_rechterbuis) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_event_disabler(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_event_disabler.lp_event_disabler) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_geselecteerde_tab_tab_systemen_en_detecties(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_geselecteerde_tab_tab_systemen_en_detecties.lp_geselecteerde_tab_tab_systemen_en_detecties) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_geselecteerde_tab_verkeer_meldingen(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_geselecteerde_tab_verkeer_meldingen.lp_geselecteerde_tab_verkeer_meldingen) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_bedienmenu_voor_verkeerslichtenstanden(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_bedienmenu_voor_verkeerslichtenstanden.lp_lb_bedienmenu_voor_verkeerslichtenstanden) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_drop_down_menu_buis_states(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_drop_down_menu_buis_states.lp_lb_drop_down_menu_buis_states) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_blusser(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_blusser.lp_lb_overzicht_systemen_en_detecties_blusser) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_blusvoorziening(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_blusvoorziening.lp_lb_overzicht_systemen_en_detecties_blusvoorziening) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_bluswatervoorziening_drop_down_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_bluswatervoorziening_drop_down_stand.lp_lb_overzicht_systemen_en_detecties_bluswatervoorziening_drop_down_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_buis(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_buis.lp_lb_overzicht_systemen_en_detecties_buis) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_detecties(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_detecties.lp_lb_overzicht_systemen_en_detecties_detecties) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_deur(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_deur.lp_lb_overzicht_systemen_en_detecties_deur) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_drop_down_richting_ventilatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_drop_down_richting_ventilatie.lp_lb_overzicht_systemen_en_detecties_drop_down_richting_ventilatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_dynamische_vluchtroute(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_dynamische_vluchtroute.lp_lb_overzicht_systemen_en_detecties_dynamische_vluchtroute) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand.lp_lb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_haspel(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_haspel.lp_lb_overzicht_systemen_en_detecties_haspel) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_hulppost(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_hulppost.lp_lb_overzicht_systemen_en_detecties_hulppost) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_noodtelefoon(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_noodtelefoon.lp_lb_overzicht_systemen_en_detecties_noodtelefoon) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte.lp_lb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte_drop_down_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte_drop_down_stand.lp_lb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte_drop_down_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_overig(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_overig.lp_lb_overzicht_systemen_en_detecties_overig) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_SOS(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_SOS.lp_lb_overzicht_systemen_en_detecties_SOS) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_tunnel(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_tunnel.lp_lb_overzicht_systemen_en_detecties_tunnel) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_ventilatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_ventilatie.lp_lb_overzicht_systemen_en_detecties_ventilatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_ventilatie_dropdown_percentage_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_ventilatie_dropdown_percentage_stand.lp_lb_overzicht_systemen_en_detecties_ventilatie_dropdown_percentage_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_verkeer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_verkeer.lp_lb_overzicht_systemen_en_detecties_verkeer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_verlichting(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_verlichting.lp_lb_overzicht_systemen_en_detecties_verlichting) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_verlichting_dropdown_percentage_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_verlichting_dropdown_percentage_stand.lp_lb_overzicht_systemen_en_detecties_verlichting_dropdown_percentage_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte.lp_lb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte_drop_down_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte_drop_down_stand.lp_lb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte_drop_down_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_vloeistofafvoer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_vloeistofafvoer.lp_lb_overzicht_systemen_en_detecties_vloeistofafvoer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_vluchtdeuren(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_vluchtdeuren.lp_lb_overzicht_systemen_en_detecties_vluchtdeuren) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie.lp_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_contourverlichting_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_contourverlichting_stand.lp_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_contourverlichting_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_geluidsbakens_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_geluidsbakens_stand.lp_lb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_geluidsbakens_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_vluchtroute(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_vluchtroute.lp_lb_overzicht_systemen_en_detecties_vluchtroute) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_lb_overzicht_systemen_en_detecties_VRI_en_afsluitboom(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_lb_overzicht_systemen_en_detecties_VRI_en_afsluitboom.lp_lb_overzicht_systemen_en_detecties_VRI_en_afsluitboom) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_melding_sos_rechterbuis_geselecteerd(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_melding_sos_rechterbuis_geselecteerd.lp_melding_sos_rechterbuis_geselecteerd) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_openen_en_sluiten_bevestigde_meldingen(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_openen_en_sluiten_bevestigde_meldingen.lp_openen_en_sluiten_bevestigde_meldingen) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_overzicht_systemen_en_detecties_drop_down_hoofd_pomp_kelder_1_stand_automaton(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_overzicht_systemen_en_detecties_drop_down_hoofd_pomp_kelder_1_stand_automaton.lp_overzicht_systemen_en_detecties_drop_down_hoofd_pomp_kelder_1_stand_automaton) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_overzicht_systemen_en_detecties_drop_down_hoofd_pomp_kelder_2_stand_automaton(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_overzicht_systemen_en_detecties_drop_down_hoofd_pomp_kelder_2_stand_automaton.lp_overzicht_systemen_en_detecties_drop_down_hoofd_pomp_kelder_2_stand_automaton) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_overzicht_systemen_en_detecties_drop_down_midden_pomp_kelder_stand_automaton(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_overzicht_systemen_en_detecties_drop_down_midden_pomp_kelder_stand_automaton.lp_overzicht_systemen_en_detecties_drop_down_midden_pomp_kelder_stand_automaton) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_bedienmenu_voor_verkeerslichtenstanden(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_bedienmenu_voor_verkeerslichtenstanden.lp_rb_bedienmenu_voor_verkeerslichtenstanden) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_drop_down_menu_buis_states(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_drop_down_menu_buis_states.lp_rb_drop_down_menu_buis_states) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_blusser(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_blusser.lp_rb_overzicht_systemen_en_detecties_blusser) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_blusvoorziening(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_blusvoorziening.lp_rb_overzicht_systemen_en_detecties_blusvoorziening) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_bluswatervoorziening_drop_down_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_bluswatervoorziening_drop_down_stand.lp_rb_overzicht_systemen_en_detecties_bluswatervoorziening_drop_down_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_buis(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_buis.lp_rb_overzicht_systemen_en_detecties_buis) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_detecties(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_detecties.lp_rb_overzicht_systemen_en_detecties_detecties) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_deur(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_deur.lp_rb_overzicht_systemen_en_detecties_deur) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_drop_down_richting_ventilatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_drop_down_richting_ventilatie.lp_rb_overzicht_systemen_en_detecties_drop_down_richting_ventilatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute.lp_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand.lp_rb_overzicht_systemen_en_detecties_dynamische_vluchtroute_dropdown_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_haspel(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_haspel.lp_rb_overzicht_systemen_en_detecties_haspel) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_hulppost(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_hulppost.lp_rb_overzicht_systemen_en_detecties_hulppost) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_noodtelefoon(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_noodtelefoon.lp_rb_overzicht_systemen_en_detecties_noodtelefoon) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte.lp_rb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte_drop_down_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte_drop_down_stand.lp_rb_overzicht_systemen_en_detecties_overdruk_veilige_ruimte_drop_down_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_overig(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_overig.lp_rb_overzicht_systemen_en_detecties_overig) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_SOS(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_SOS.lp_rb_overzicht_systemen_en_detecties_SOS) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_tunnel(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_tunnel.lp_rb_overzicht_systemen_en_detecties_tunnel) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_ventilatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_ventilatie.lp_rb_overzicht_systemen_en_detecties_ventilatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_ventilatie_dropdown_percentage_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_ventilatie_dropdown_percentage_stand.lp_rb_overzicht_systemen_en_detecties_ventilatie_dropdown_percentage_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_verkeer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_verkeer.lp_rb_overzicht_systemen_en_detecties_verkeer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_verlichting(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_verlichting.lp_rb_overzicht_systemen_en_detecties_verlichting) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_verlichting_dropdown_percentage_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_verlichting_dropdown_percentage_stand.lp_rb_overzicht_systemen_en_detecties_verlichting_dropdown_percentage_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte.lp_rb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte_drop_down_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte_drop_down_stand.lp_rb_overzicht_systemen_en_detecties_verlichting_veilige_ruimte_drop_down_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_vloeistofafvoer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_vloeistofafvoer.lp_rb_overzicht_systemen_en_detecties_vloeistofafvoer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_vluchtdeuren(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_vluchtdeuren.lp_rb_overzicht_systemen_en_detecties_vluchtdeuren) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie.lp_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_contourverlichting_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_contourverlichting_stand.lp_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_contourverlichting_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_geluidsbakens_stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_geluidsbakens_stand.lp_rb_overzicht_systemen_en_detecties_vluchtdeurindicatie_dropdown_geluidsbakens_stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_vluchtroute(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_vluchtroute.lp_rb_overzicht_systemen_en_detecties_vluchtroute) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_rb_overzicht_systemen_en_detecties_VRI_en_afsluitboom(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_rb_overzicht_systemen_en_detecties_VRI_en_afsluitboom.lp_rb_overzicht_systemen_en_detecties_VRI_en_afsluitboom) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup10(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup10.lp_sup10) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup15(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup15.lp_sup15) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup2(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup2.lp_sup2) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup30(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup30.lp_sup30) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup31(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup31.lp_sup31) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup34(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup34.lp_sup34) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup35(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup35.lp_sup35) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup38(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup38.lp_sup38) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup39(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup39.lp_sup39) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup4(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup4.lp_sup4) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup41(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup41.lp_sup41) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup42(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup42.lp_sup42) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup43(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup43.lp_sup43) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup44(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup44.lp_sup44) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup47(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup47.lp_sup47) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup48(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup48.lp_sup48) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup49(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup49.lp_sup49) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup50(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup50.lp_sup50) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup51(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup51.lp_sup51) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup56(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup56.lp_sup56) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup6(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup6.lp_sup6) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup7(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup7.lp_sup7) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup71(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup71.lp_sup71) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup72(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup72.lp_sup72) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup75(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup75.lp_sup75) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup76(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup76.lp_sup76) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup79(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup79.lp_sup79) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup8(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup8.lp_sup8) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup80(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup80.lp_sup80) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup82(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup82.lp_sup82) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup83(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup83.lp_sup83) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup84(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup84.lp_sup84) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup85(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup85.lp_sup85) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup86(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup86.lp_sup86) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup88(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup88.lp_sup88) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup89(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup89.lp_sup89) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup9(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup9.lp_sup9) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup92(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup92.lp_sup92) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup93(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup93.lp_sup93) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_sup95(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_sup95.lp_sup95) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Bediening_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Bediening_KnopAuto_Knop.lp_Tunnel_BrandBlusInstallatie_Bediening_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Bediening_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Bediening_KnopAuto_Waarnemer.lp_Tunnel_BrandBlusInstallatie_Bediening_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Bediening_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Bediening_KnopHand_Knop.lp_Tunnel_BrandBlusInstallatie_Bediening_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Bediening_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Bediening_KnopHand_Waarnemer.lp_Tunnel_BrandBlusInstallatie_Bediening_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Bediening_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Bediening_Modus.lp_Tunnel_BrandBlusInstallatie_Bediening_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_FysiekeRelatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_FysiekeRelatie.lp_Tunnel_BrandBlusInstallatie_FysiekeRelatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_knop_bewaken_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_knop_bewaken_Knop.lp_Tunnel_BrandBlusInstallatie_knop_bewaken_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_knop_bewaken_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_knop_bewaken_Waarnemer.lp_Tunnel_BrandBlusInstallatie_knop_bewaken_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_knop_blussen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_knop_blussen_Knop.lp_Tunnel_BrandBlusInstallatie_knop_blussen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_knop_blussen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_knop_blussen_Waarnemer.lp_Tunnel_BrandBlusInstallatie_knop_blussen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Pomp(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Pomp.lp_Tunnel_BrandBlusInstallatie_Pomp) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_Regime(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_Regime.lp_Tunnel_BrandBlusInstallatie_Regime) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_SensorHoog(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_SensorHoog.lp_Tunnel_BrandBlusInstallatie_SensorHoog) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_BrandBlusInstallatie_SensorLaag(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_BrandBlusInstallatie_SensorLaag.lp_Tunnel_BrandBlusInstallatie_SensorLaag) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Bediening_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Bediening_KnopAuto_Knop.lp_Tunnel_HoofdPompkelder1_Bediening_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Bediening_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Bediening_KnopAuto_Waarnemer.lp_Tunnel_HoofdPompkelder1_Bediening_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Bediening_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Bediening_KnopHand_Knop.lp_Tunnel_HoofdPompkelder1_Bediening_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Bediening_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Bediening_KnopHand_Waarnemer.lp_Tunnel_HoofdPompkelder1_Bediening_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Bediening_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Bediening_Modus.lp_Tunnel_HoofdPompkelder1_Bediening_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_FysiekeRelatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_FysiekeRelatie.lp_Tunnel_HoofdPompkelder1_FysiekeRelatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_KnopBergen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_KnopBergen_Knop.lp_Tunnel_HoofdPompkelder1_KnopBergen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_KnopBergen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_KnopBergen_Waarnemer.lp_Tunnel_HoofdPompkelder1_KnopBergen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_KnopLeeghouden_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_KnopLeeghouden_Knop.lp_Tunnel_HoofdPompkelder1_KnopLeeghouden_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_KnopLeeghouden_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_KnopLeeghouden_Waarnemer.lp_Tunnel_HoofdPompkelder1_KnopLeeghouden_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_KnopUit_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_KnopUit_Knop.lp_Tunnel_HoofdPompkelder1_KnopUit_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_KnopUit_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_KnopUit_Waarnemer.lp_Tunnel_HoofdPompkelder1_KnopUit_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Pomp1(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Pomp1.lp_Tunnel_HoofdPompkelder1_Pomp1) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Pomp2(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Pomp2.lp_Tunnel_HoofdPompkelder1_Pomp2) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_Regime(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_Regime.lp_Tunnel_HoofdPompkelder1_Regime) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_SensorHooghoogwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_SensorHooghoogwater.lp_Tunnel_HoofdPompkelder1_SensorHooghoogwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_SensorLaaghoogwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_SensorLaaghoogwater.lp_Tunnel_HoofdPompkelder1_SensorLaaghoogwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_SensorLaagwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_SensorLaagwater.lp_Tunnel_HoofdPompkelder1_SensorLaagwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_SensorMaxstartwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_SensorMaxstartwater.lp_Tunnel_HoofdPompkelder1_SensorMaxstartwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder1_SensorStartwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder1_SensorStartwater.lp_Tunnel_HoofdPompkelder1_SensorStartwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Bediening_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Bediening_KnopAuto_Knop.lp_Tunnel_HoofdPompkelder2_Bediening_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Bediening_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Bediening_KnopAuto_Waarnemer.lp_Tunnel_HoofdPompkelder2_Bediening_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Bediening_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Bediening_KnopHand_Knop.lp_Tunnel_HoofdPompkelder2_Bediening_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Bediening_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Bediening_KnopHand_Waarnemer.lp_Tunnel_HoofdPompkelder2_Bediening_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Bediening_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Bediening_Modus.lp_Tunnel_HoofdPompkelder2_Bediening_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_FysiekeRelatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_FysiekeRelatie.lp_Tunnel_HoofdPompkelder2_FysiekeRelatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_KnopBergen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_KnopBergen_Knop.lp_Tunnel_HoofdPompkelder2_KnopBergen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_KnopBergen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_KnopBergen_Waarnemer.lp_Tunnel_HoofdPompkelder2_KnopBergen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_KnopLeeghouden_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_KnopLeeghouden_Knop.lp_Tunnel_HoofdPompkelder2_KnopLeeghouden_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_KnopLeeghouden_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_KnopLeeghouden_Waarnemer.lp_Tunnel_HoofdPompkelder2_KnopLeeghouden_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_KnopUit_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_KnopUit_Knop.lp_Tunnel_HoofdPompkelder2_KnopUit_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_KnopUit_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_KnopUit_Waarnemer.lp_Tunnel_HoofdPompkelder2_KnopUit_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Pomp1(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Pomp1.lp_Tunnel_HoofdPompkelder2_Pomp1) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Pomp2(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Pomp2.lp_Tunnel_HoofdPompkelder2_Pomp2) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_Regime(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_Regime.lp_Tunnel_HoofdPompkelder2_Regime) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_SensorHooghoogwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_SensorHooghoogwater.lp_Tunnel_HoofdPompkelder2_SensorHooghoogwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_SensorLaaghoogwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_SensorLaaghoogwater.lp_Tunnel_HoofdPompkelder2_SensorLaaghoogwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_SensorLaagwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_SensorLaagwater.lp_Tunnel_HoofdPompkelder2_SensorLaagwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_SensorMaxstartwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_SensorMaxstartwater.lp_Tunnel_HoofdPompkelder2_SensorMaxstartwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_HoofdPompkelder2_SensorStartwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_HoofdPompkelder2_SensorStartwater.lp_Tunnel_HoofdPompkelder2_SensorStartwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Knop.lp_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Waarnemer.lp_Tunnel_MiddenPompkelder_Bediening_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_Bediening_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Bediening_KnopHand_Knop.lp_Tunnel_MiddenPompkelder_Bediening_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_Bediening_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Bediening_KnopHand_Waarnemer.lp_Tunnel_MiddenPompkelder_Bediening_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_Bediening_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Bediening_Modus.lp_Tunnel_MiddenPompkelder_Bediening_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_FysiekeRelatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_FysiekeRelatie.lp_Tunnel_MiddenPompkelder_FysiekeRelatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_KnopBergen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_KnopBergen_Knop.lp_Tunnel_MiddenPompkelder_KnopBergen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_KnopBergen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_KnopBergen_Waarnemer.lp_Tunnel_MiddenPompkelder_KnopBergen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_KnopLeeghouden_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_KnopLeeghouden_Knop.lp_Tunnel_MiddenPompkelder_KnopLeeghouden_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_KnopLeeghouden_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_KnopLeeghouden_Waarnemer.lp_Tunnel_MiddenPompkelder_KnopLeeghouden_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_KnopUit_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_KnopUit_Knop.lp_Tunnel_MiddenPompkelder_KnopUit_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_KnopUit_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_KnopUit_Waarnemer.lp_Tunnel_MiddenPompkelder_KnopUit_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_Pomp1(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Pomp1.lp_Tunnel_MiddenPompkelder_Pomp1) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_Pomp2(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Pomp2.lp_Tunnel_MiddenPompkelder_Pomp2) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_PompRichting(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_PompRichting.lp_Tunnel_MiddenPompkelder_PompRichting) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_Regime(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_Regime.lp_Tunnel_MiddenPompkelder_Regime) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_SensorHooghoogwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_SensorHooghoogwater.lp_Tunnel_MiddenPompkelder_SensorHooghoogwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_SensorLaaghoogwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_SensorLaaghoogwater.lp_Tunnel_MiddenPompkelder_SensorLaaghoogwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_SensorLaagwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_SensorLaagwater.lp_Tunnel_MiddenPompkelder_SensorLaagwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_SensorMaxstartwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_SensorMaxstartwater.lp_Tunnel_MiddenPompkelder_SensorMaxstartwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenPompkelder_SensorStartwater(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenPompkelder_SensorStartwater.lp_Tunnel_MiddenPompkelder_SensorStartwater) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Knop.lp_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Knop.lp_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_Modus.lp_Tunnel_MiddenTunnelKanaal_BedieningDynamischeVluchtrouteIndicatie_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Knop.lp_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Knop.lp_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_Modus.lp_Tunnel_MiddenTunnelKanaal_BedieningOverdruk_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopAuto_Knop.lp_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopAuto_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopHand_Knop.lp_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopHand_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_Modus.lp_Tunnel_MiddenTunnelKanaal_BedieningVerlichting_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_DynamischeVluchtrouteIndicatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_DynamischeVluchtrouteIndicatie.lp_Tunnel_MiddenTunnelKanaal_DynamischeVluchtrouteIndicatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieAflopend_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieOplopend_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopDynamischeVluchtrouteIndicatieUit_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopOverdrukLinks_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopOverdrukRechts_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopOverdrukUit_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopStartBoodschap_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopStopBoodschap_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopVerlichtingAan_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopVerlichtingAan_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopVerlichtingAan_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopVerlichtingAan_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopVerlichtingAan_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopVerlichtingAan_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopVerlichtingUit_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopVerlichtingUit_Knop.lp_Tunnel_MiddenTunnelKanaal_KnopVerlichtingUit_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_KnopVerlichtingUit_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_KnopVerlichtingUit_Waarnemer.lp_Tunnel_MiddenTunnelKanaal_KnopVerlichtingUit_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_Luidspreker(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_Luidspreker.lp_Tunnel_MiddenTunnelKanaal_Luidspreker) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_Overdruk(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_Overdruk.lp_Tunnel_MiddenTunnelKanaal_Overdruk) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_MiddenTunnelKanaal_Verlichting(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_MiddenTunnelKanaal_Verlichting.lp_Tunnel_MiddenTunnelKanaal_Verlichting) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom1_ActuatorNeer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom1_ActuatorNeer.lp_Tunnel_Verkeersbuis1_Afsluitboom1_ActuatorNeer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom1_ActuatorOp(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom1_ActuatorOp.lp_Tunnel_Verkeersbuis1_Afsluitboom1_ActuatorOp) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom1_FysiekeRelatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom1_FysiekeRelatie.lp_Tunnel_Verkeersbuis1_Afsluitboom1_FysiekeRelatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom1_ObstakelDetectie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom1_ObstakelDetectie.lp_Tunnel_Verkeersbuis1_Afsluitboom1_ObstakelDetectie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom1_SensorDicht(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom1_SensorDicht.lp_Tunnel_Verkeersbuis1_Afsluitboom1_SensorDicht) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom1_SensorOpen(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom1_SensorOpen.lp_Tunnel_Verkeersbuis1_Afsluitboom1_SensorOpen) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom2_ActuatorNeer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom2_ActuatorNeer.lp_Tunnel_Verkeersbuis1_Afsluitboom2_ActuatorNeer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom2_ActuatorOp(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom2_ActuatorOp.lp_Tunnel_Verkeersbuis1_Afsluitboom2_ActuatorOp) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom2_FysiekeRelatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom2_FysiekeRelatie.lp_Tunnel_Verkeersbuis1_Afsluitboom2_FysiekeRelatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom2_ObstakelDetectie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom2_ObstakelDetectie.lp_Tunnel_Verkeersbuis1_Afsluitboom2_ObstakelDetectie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom2_SensorDicht(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom2_SensorDicht.lp_Tunnel_Verkeersbuis1_Afsluitboom2_SensorDicht) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Afsluitboom2_SensorOpen(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Afsluitboom2_SensorOpen.lp_Tunnel_Verkeersbuis1_Afsluitboom2_SensorOpen) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopAuto_Knop.lp_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopHand_Knop.lp_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_Modus.lp_Tunnel_Verkeersbuis1_BedieningAfsluitbomen_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopAuto_Knop.lp_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopHand_Knop.lp_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningVentilatie_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVentilatie_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVentilatie_Modus.lp_Tunnel_Verkeersbuis1_BedieningVentilatie_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopAuto_Knop.lp_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopHand_Knop.lp_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_Modus.lp_Tunnel_Verkeersbuis1_BedieningVerkeerslichten_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopAuto_Knop.lp_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopHand_Knop.lp_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis1_BedieningVerlichting_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_BedieningVerlichting_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_BedieningVerlichting_Modus.lp_Tunnel_Verkeersbuis1_BedieningVerlichting_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Evacuatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Evacuatie.lp_Tunnel_Verkeersbuis1_Evacuatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastA_Brandslang(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastA_Brandslang.lp_Tunnel_Verkeersbuis1_HulppostkastA_Brandslang) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastA_Handblusser(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastA_Handblusser.lp_Tunnel_Verkeersbuis1_HulppostkastA_Handblusser) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastA_Noodtelefoon(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastA_Noodtelefoon.lp_Tunnel_Verkeersbuis1_HulppostkastA_Noodtelefoon) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastA_SensorOpen(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastA_SensorOpen.lp_Tunnel_Verkeersbuis1_HulppostkastA_SensorOpen) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastC_Handblusser(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastC_Handblusser.lp_Tunnel_Verkeersbuis1_HulppostkastC_Handblusser) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastC_Noodtelefoon(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastC_Noodtelefoon.lp_Tunnel_Verkeersbuis1_HulppostkastC_Noodtelefoon) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_HulppostkastC_SensorOpen(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_HulppostkastC_SensorOpen.lp_Tunnel_Verkeersbuis1_HulppostkastC_SensorOpen) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_J32_Stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_J32_Stand.lp_Tunnel_Verkeersbuis1_J32_Stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_J32_TimerVrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_J32_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis1_J32_TimerVrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Kanaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Kanaal.lp_Tunnel_Verkeersbuis1_Kanaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCalamiteit_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCalamiteit_Knop.lp_Tunnel_Verkeersbuis1_KnopCalamiteit_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCalamiteit_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCalamiteit_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCalamiteit_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera1_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera1_Knop.lp_Tunnel_Verkeersbuis1_KnopCamera1_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera1_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera1_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCamera1_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera2_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera2_Knop.lp_Tunnel_Verkeersbuis1_KnopCamera2_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera2_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera2_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCamera2_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera3_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera3_Knop.lp_Tunnel_Verkeersbuis1_KnopCamera3_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera3_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera3_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCamera3_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera4_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera4_Knop.lp_Tunnel_Verkeersbuis1_KnopCamera4_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera4_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera4_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCamera4_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera5_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera5_Knop.lp_Tunnel_Verkeersbuis1_KnopCamera5_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera5_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera5_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCamera5_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera6_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera6_Knop.lp_Tunnel_Verkeersbuis1_KnopCamera6_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopCamera6_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopCamera6_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopCamera6_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopEvacuatie_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopEvacuatie_Knop.lp_Tunnel_Verkeersbuis1_KnopEvacuatie_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopEvacuatie_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopEvacuatie_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopEvacuatie_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopHerstel_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopHerstel_Knop.lp_Tunnel_Verkeersbuis1_KnopHerstel_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopHerstel_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopHerstel_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopHerstel_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopKnipperVerkeerslichten_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopKnipperVerkeerslichten_Knop.lp_Tunnel_Verkeersbuis1_KnopKnipperVerkeerslichten_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopKnipperVerkeerslichten_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopKnipperVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopKnipperVerkeerslichten_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOnderhoud_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOnderhoud_Knop.lp_Tunnel_Verkeersbuis1_KnopOnderhoud_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOnderhoud_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOnderhoud_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopOnderhoud_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOpenAfsluitbomen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOpenAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis1_KnopOpenAfsluitbomen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOpenAfsluitbomen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOpenAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopOpenAfsluitbomen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Knop.lp_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopOpenVerkeersbuis_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOperationeel_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOperationeel_Knop.lp_Tunnel_Verkeersbuis1_KnopOperationeel_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopOperationeel_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopOperationeel_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopOperationeel_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopRoodVerkeerslichten_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopRoodVerkeerslichten_Knop.lp_Tunnel_Verkeersbuis1_KnopRoodVerkeerslichten_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopRoodVerkeerslichten_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopRoodVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopRoodVerkeerslichten_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopSluitAfsluitbomen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopSluitAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis1_KnopSluitAfsluitbomen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopSluitAfsluitbomen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopSluitAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopSluitAfsluitbomen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopSluitOnvoorwaardelijkAfsluitbomen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Knop.lp_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopSluitVerkeersbuis_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStartBoodschap_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStartBoodschap_Knop.lp_Tunnel_Verkeersbuis1_KnopStartBoodschap_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStartBoodschap_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStartBoodschap_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopStartBoodschap_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStartLive_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStartLive_Knop.lp_Tunnel_Verkeersbuis1_KnopStartLive_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStartLive_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStartLive_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopStartLive_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStopAfsluitbomen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStopAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis1_KnopStopAfsluitbomen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStopAfsluitbomen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStopAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopStopAfsluitbomen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStopBoodschap_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStopBoodschap_Knop.lp_Tunnel_Verkeersbuis1_KnopStopBoodschap_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStopBoodschap_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStopBoodschap_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopStopBoodschap_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStopLive_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStopLive_Knop.lp_Tunnel_Verkeersbuis1_KnopStopLive_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopStopLive_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopStopLive_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopStopLive_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopUitVerkeerslichten_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopUitVerkeerslichten_Knop.lp_Tunnel_Verkeersbuis1_KnopUitVerkeerslichten_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopUitVerkeerslichten_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopUitVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopUitVerkeerslichten_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie0_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie0_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie0_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie0_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie0_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie0_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie1_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie1_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie1_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie1_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie1_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie1_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie2_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie2_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie2_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie2_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie2_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie2_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie3_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie3_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie3_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie3_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie3_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie3_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie4_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie4_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie4_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie4_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie4_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie4_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie5_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie5_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie5_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie5_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie5_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie5_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie6_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie6_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie6_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie6_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie6_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie6_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie7_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie7_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie7_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie7_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie7_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie7_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie8_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie8_Knop.lp_Tunnel_Verkeersbuis1_KnopVentilatie8_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVentilatie8_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVentilatie8_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVentilatie8_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting0_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting0_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting0_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting0_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting0_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting0_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting1_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting1_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting1_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting1_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting1_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting1_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting2_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting2_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting2_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting2_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting2_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting2_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting3_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting3_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting3_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting3_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting3_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting3_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting4_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting4_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting4_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting4_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting4_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting4_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting5_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting5_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting5_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting5_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting5_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting5_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting6_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting6_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting6_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting6_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting6_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting6_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting7_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting7_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting7_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting7_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting7_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting7_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting8_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting8_Knop.lp_Tunnel_Verkeersbuis1_KnopVerlichting8_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_KnopVerlichting8_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_KnopVerlichting8_Waarnemer.lp_Tunnel_Verkeersbuis1_KnopVerlichting8_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Lichtsensor(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Lichtsensor.lp_Tunnel_Verkeersbuis1_Lichtsensor) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Luidspreker(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Luidspreker.lp_Tunnel_Verkeersbuis1_Luidspreker) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_MatrixbordLos(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_MatrixbordLos.lp_Tunnel_Verkeersbuis1_MatrixbordLos) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_MatrixbordVerkeerslicht(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_MatrixbordVerkeerslicht.lp_Tunnel_Verkeersbuis1_MatrixbordVerkeerslicht) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Onderhoud(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Onderhoud.lp_Tunnel_Verkeersbuis1_Onderhoud) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Knop.lp_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Waarnemer.lp_Tunnel_Verkeersbuis1_PopUp_KnopAfwijzen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Knop.lp_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Waarnemer.lp_Tunnel_Verkeersbuis1_PopUp_KnopBevestigen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_Relatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_Relatie.lp_Tunnel_Verkeersbuis1_PopUp_Relatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_Timer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_Timer.lp_Tunnel_Verkeersbuis1_PopUp_Timer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_PopUp_Venster(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_PopUp_Venster.lp_Tunnel_Verkeersbuis1_PopUp_Venster) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Recorder(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Recorder.lp_Tunnel_Verkeersbuis1_Recorder) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Rookdetectie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Rookdetectie.lp_Tunnel_Verkeersbuis1_Rookdetectie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_SOS(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_SOS.lp_Tunnel_Verkeersbuis1_SOS) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Standby(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Standby.lp_Tunnel_Verkeersbuis1_Standby) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_StandVerkeersbuis(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_StandVerkeersbuis.lp_Tunnel_Verkeersbuis1_StandVerkeersbuis) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Ventilatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Ventilatie.lp_Tunnel_Verkeersbuis1_Ventilatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_VentilatieIngang(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_VentilatieIngang.lp_Tunnel_Verkeersbuis1_VentilatieIngang) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_VentilatieRichting(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_VentilatieRichting.lp_Tunnel_Verkeersbuis1_VentilatieRichting) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht1_Relatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht1_Relatie.lp_Tunnel_Verkeersbuis1_Verkeerslicht1_Relatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht1_Stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht1_Stand.lp_Tunnel_Verkeersbuis1_Verkeerslicht1_Stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht1_TimerVrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht1_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis1_Verkeerslicht1_TimerVrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht1_Vrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht1_Vrijgavesignaal.lp_Tunnel_Verkeersbuis1_Verkeerslicht1_Vrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht2_Relatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht2_Relatie.lp_Tunnel_Verkeersbuis1_Verkeerslicht2_Relatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht2_Stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht2_Stand.lp_Tunnel_Verkeersbuis1_Verkeerslicht2_Stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht2_TimerVrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht2_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis1_Verkeerslicht2_TimerVrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht2_Vrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht2_Vrijgavesignaal.lp_Tunnel_Verkeersbuis1_Verkeerslicht2_Vrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht3_Relatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht3_Relatie.lp_Tunnel_Verkeersbuis1_Verkeerslicht3_Relatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht3_Stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht3_Stand.lp_Tunnel_Verkeersbuis1_Verkeerslicht3_Stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht3_TimerVrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht3_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis1_Verkeerslicht3_TimerVrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verkeerslicht3_Vrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verkeerslicht3_Vrijgavesignaal.lp_Tunnel_Verkeersbuis1_Verkeerslicht3_Vrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Verlichting(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Verlichting.lp_Tunnel_Verkeersbuis1_Verlichting) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_Modus.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningContourVerlichting_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_Modus.lp_Tunnel_Verkeersbuis1_Vluchtdeur_BedieningGeluidsbaken_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_ContourVerlichting(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_ContourVerlichting.lp_Tunnel_Verkeersbuis1_Vluchtdeur_ContourVerlichting) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_Geluidsbaken(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_Geluidsbaken.lp_Tunnel_Verkeersbuis1_Vluchtdeur_Geluidsbaken) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Knop.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer.lp_Tunnel_Verkeersbuis1_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_Vluchtdeur_SensorOpen(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_Vluchtdeur_SensorOpen.lp_Tunnel_Verkeersbuis1_Vluchtdeur_SensorOpen) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis1_WisselTimerAudio(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis1_WisselTimerAudio.lp_Tunnel_Verkeersbuis1_WisselTimerAudio) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom1_ActuatorNeer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom1_ActuatorNeer.lp_Tunnel_Verkeersbuis2_Afsluitboom1_ActuatorNeer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom1_ActuatorOp(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom1_ActuatorOp.lp_Tunnel_Verkeersbuis2_Afsluitboom1_ActuatorOp) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom1_FysiekeRelatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom1_FysiekeRelatie.lp_Tunnel_Verkeersbuis2_Afsluitboom1_FysiekeRelatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom1_ObstakelDetectie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom1_ObstakelDetectie.lp_Tunnel_Verkeersbuis2_Afsluitboom1_ObstakelDetectie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom1_SensorDicht(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom1_SensorDicht.lp_Tunnel_Verkeersbuis2_Afsluitboom1_SensorDicht) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom1_SensorOpen(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom1_SensorOpen.lp_Tunnel_Verkeersbuis2_Afsluitboom1_SensorOpen) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom2_ActuatorNeer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom2_ActuatorNeer.lp_Tunnel_Verkeersbuis2_Afsluitboom2_ActuatorNeer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom2_ActuatorOp(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom2_ActuatorOp.lp_Tunnel_Verkeersbuis2_Afsluitboom2_ActuatorOp) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom2_FysiekeRelatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom2_FysiekeRelatie.lp_Tunnel_Verkeersbuis2_Afsluitboom2_FysiekeRelatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom2_ObstakelDetectie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom2_ObstakelDetectie.lp_Tunnel_Verkeersbuis2_Afsluitboom2_ObstakelDetectie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom2_SensorDicht(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom2_SensorDicht.lp_Tunnel_Verkeersbuis2_Afsluitboom2_SensorDicht) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Afsluitboom2_SensorOpen(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Afsluitboom2_SensorOpen.lp_Tunnel_Verkeersbuis2_Afsluitboom2_SensorOpen) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopAuto_Knop.lp_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopHand_Knop.lp_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_Modus.lp_Tunnel_Verkeersbuis2_BedieningAfsluitbomen_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopAuto_Knop.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopHand_Knop.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVentilatie_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVentilatie_Modus.lp_Tunnel_Verkeersbuis2_BedieningVentilatie_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopAuto_Knop.lp_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopHand_Knop.lp_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_Modus.lp_Tunnel_Verkeersbuis2_BedieningVerkeerslichten_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopAuto_Knop.lp_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopHand_Knop.lp_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis2_BedieningVerlichting_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_BedieningVerlichting_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_BedieningVerlichting_Modus.lp_Tunnel_Verkeersbuis2_BedieningVerlichting_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Evacuatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Evacuatie.lp_Tunnel_Verkeersbuis2_Evacuatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastA_Brandslang(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastA_Brandslang.lp_Tunnel_Verkeersbuis2_HulppostkastA_Brandslang) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastA_Handblusser(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastA_Handblusser.lp_Tunnel_Verkeersbuis2_HulppostkastA_Handblusser) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastA_Noodtelefoon(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastA_Noodtelefoon.lp_Tunnel_Verkeersbuis2_HulppostkastA_Noodtelefoon) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastA_SensorOpen(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastA_SensorOpen.lp_Tunnel_Verkeersbuis2_HulppostkastA_SensorOpen) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastC_Handblusser(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastC_Handblusser.lp_Tunnel_Verkeersbuis2_HulppostkastC_Handblusser) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastC_Noodtelefoon(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastC_Noodtelefoon.lp_Tunnel_Verkeersbuis2_HulppostkastC_Noodtelefoon) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_HulppostkastC_SensorOpen(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_HulppostkastC_SensorOpen.lp_Tunnel_Verkeersbuis2_HulppostkastC_SensorOpen) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_J32_Stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_J32_Stand.lp_Tunnel_Verkeersbuis2_J32_Stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_J32_TimerVrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_J32_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_J32_TimerVrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Kanaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Kanaal.lp_Tunnel_Verkeersbuis2_Kanaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCalamiteit_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCalamiteit_Knop.lp_Tunnel_Verkeersbuis2_KnopCalamiteit_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCalamiteit_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCalamiteit_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCalamiteit_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera1_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera1_Knop.lp_Tunnel_Verkeersbuis2_KnopCamera1_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera1_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera1_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCamera1_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera2_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera2_Knop.lp_Tunnel_Verkeersbuis2_KnopCamera2_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera2_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera2_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCamera2_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera3_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera3_Knop.lp_Tunnel_Verkeersbuis2_KnopCamera3_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera3_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera3_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCamera3_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera4_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera4_Knop.lp_Tunnel_Verkeersbuis2_KnopCamera4_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera4_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera4_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCamera4_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera5_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera5_Knop.lp_Tunnel_Verkeersbuis2_KnopCamera5_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera5_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera5_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCamera5_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera6_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera6_Knop.lp_Tunnel_Verkeersbuis2_KnopCamera6_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopCamera6_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopCamera6_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopCamera6_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopEvacuatie_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopEvacuatie_Knop.lp_Tunnel_Verkeersbuis2_KnopEvacuatie_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopEvacuatie_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopEvacuatie_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopEvacuatie_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopHerstel_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopHerstel_Knop.lp_Tunnel_Verkeersbuis2_KnopHerstel_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopHerstel_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopHerstel_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopHerstel_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Knop.lp_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopKnipperVerkeerslichten_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOnderhoud_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOnderhoud_Knop.lp_Tunnel_Verkeersbuis2_KnopOnderhoud_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOnderhoud_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOnderhoud_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopOnderhoud_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOpenAfsluitbomen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOpenAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis2_KnopOpenAfsluitbomen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOpenAfsluitbomen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOpenAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopOpenAfsluitbomen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Knop.lp_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopOpenVerkeersbuis_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOperationeel_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOperationeel_Knop.lp_Tunnel_Verkeersbuis2_KnopOperationeel_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopOperationeel_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopOperationeel_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopOperationeel_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Knop.lp_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopRoodVerkeerslichten_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopSluitAfsluitbomen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopSluitAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis2_KnopSluitAfsluitbomen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopSluitAfsluitbomen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopSluitAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopSluitAfsluitbomen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopSluitOnvoorwaardelijkAfsluitbomen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Knop.lp_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopSluitVerkeersbuis_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStartBoodschap_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStartBoodschap_Knop.lp_Tunnel_Verkeersbuis2_KnopStartBoodschap_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStartBoodschap_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStartBoodschap_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopStartBoodschap_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStartLive_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStartLive_Knop.lp_Tunnel_Verkeersbuis2_KnopStartLive_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStartLive_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStartLive_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopStartLive_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStopAfsluitbomen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStopAfsluitbomen_Knop.lp_Tunnel_Verkeersbuis2_KnopStopAfsluitbomen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStopAfsluitbomen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStopAfsluitbomen_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopStopAfsluitbomen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStopBoodschap_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStopBoodschap_Knop.lp_Tunnel_Verkeersbuis2_KnopStopBoodschap_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStopBoodschap_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStopBoodschap_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopStopBoodschap_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStopLive_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStopLive_Knop.lp_Tunnel_Verkeersbuis2_KnopStopLive_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopStopLive_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopStopLive_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopStopLive_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopUitVerkeerslichten_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopUitVerkeerslichten_Knop.lp_Tunnel_Verkeersbuis2_KnopUitVerkeerslichten_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopUitVerkeerslichten_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopUitVerkeerslichten_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopUitVerkeerslichten_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie0_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie0_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie0_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie0_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie0_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie0_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie1_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie1_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie1_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie1_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie1_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie1_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie2_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie2_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie2_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie2_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie2_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie2_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie3_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie3_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie3_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie3_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie3_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie3_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie4_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie4_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie4_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie4_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie4_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie4_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie5_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie5_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie5_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie5_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie5_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie5_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie6_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie6_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie6_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie6_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie6_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie6_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie7_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie7_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie7_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie7_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie7_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie7_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie8_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Knop.lp_Tunnel_Verkeersbuis2_KnopVentilatie8_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVentilatie8_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting0_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting0_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting0_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting0_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting0_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting0_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting1_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting1_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting1_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting1_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting1_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting1_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting2_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting2_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting2_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting2_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting2_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting2_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting3_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting3_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting3_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting3_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting3_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting3_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting4_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting4_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting4_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting4_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting4_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting4_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting5_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting5_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting5_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting5_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting5_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting5_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting6_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting6_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting6_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting6_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting6_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting6_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting7_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting7_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting7_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting7_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting7_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting7_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting8_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting8_Knop.lp_Tunnel_Verkeersbuis2_KnopVerlichting8_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_KnopVerlichting8_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_KnopVerlichting8_Waarnemer.lp_Tunnel_Verkeersbuis2_KnopVerlichting8_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Lichtsensor(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Lichtsensor.lp_Tunnel_Verkeersbuis2_Lichtsensor) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Luidspreker(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Luidspreker.lp_Tunnel_Verkeersbuis2_Luidspreker) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_MatrixbordLos(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_MatrixbordLos.lp_Tunnel_Verkeersbuis2_MatrixbordLos) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_MatrixbordVerkeerslicht(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_MatrixbordVerkeerslicht.lp_Tunnel_Verkeersbuis2_MatrixbordVerkeerslicht) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Onderhoud(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Onderhoud.lp_Tunnel_Verkeersbuis2_Onderhoud) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Knop.lp_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Waarnemer.lp_Tunnel_Verkeersbuis2_PopUp_KnopAfwijzen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Knop.lp_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Waarnemer.lp_Tunnel_Verkeersbuis2_PopUp_KnopBevestigen_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_Relatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_Relatie.lp_Tunnel_Verkeersbuis2_PopUp_Relatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_Timer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_Timer.lp_Tunnel_Verkeersbuis2_PopUp_Timer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_PopUp_Venster(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_PopUp_Venster.lp_Tunnel_Verkeersbuis2_PopUp_Venster) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Recorder(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Recorder.lp_Tunnel_Verkeersbuis2_Recorder) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Rookdetectie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Rookdetectie.lp_Tunnel_Verkeersbuis2_Rookdetectie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_SOS(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_SOS.lp_Tunnel_Verkeersbuis2_SOS) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Standby(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Standby.lp_Tunnel_Verkeersbuis2_Standby) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_StandVerkeersbuis(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_StandVerkeersbuis.lp_Tunnel_Verkeersbuis2_StandVerkeersbuis) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Ventilatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Ventilatie.lp_Tunnel_Verkeersbuis2_Ventilatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_VentilatieIngang(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_VentilatieIngang.lp_Tunnel_Verkeersbuis2_VentilatieIngang) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_VentilatieRichting(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_VentilatieRichting.lp_Tunnel_Verkeersbuis2_VentilatieRichting) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht1_Relatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht1_Relatie.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_Relatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht1_Stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht1_Stand.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_Stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_TimerVrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht1_Vrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht1_Vrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht1_Vrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht2_Relatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht2_Relatie.lp_Tunnel_Verkeersbuis2_Verkeerslicht2_Relatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht2_Stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht2_Stand.lp_Tunnel_Verkeersbuis2_Verkeerslicht2_Stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht2_TimerVrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht2_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht2_TimerVrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht2_Vrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht2_Vrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht2_Vrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht3_Relatie(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht3_Relatie.lp_Tunnel_Verkeersbuis2_Verkeerslicht3_Relatie) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht3_Stand(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht3_Stand.lp_Tunnel_Verkeersbuis2_Verkeerslicht3_Stand) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht3_TimerVrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht3_TimerVrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht3_TimerVrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verkeerslicht3_Vrijgavesignaal(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verkeerslicht3_Vrijgavesignaal.lp_Tunnel_Verkeersbuis2_Verkeerslicht3_Vrijgavesignaal) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Verlichting(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Verlichting.lp_Tunnel_Verkeersbuis2_Verlichting) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopHand_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_Modus.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningContourVerlichting_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopAuto_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_KnopHand_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_Modus(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_Modus.lp_Tunnel_Verkeersbuis2_Vluchtdeur_BedieningGeluidsbaken_Modus) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_ContourVerlichting(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_ContourVerlichting.lp_Tunnel_Verkeersbuis2_Vluchtdeur_ContourVerlichting) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_Geluidsbaken(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_Geluidsbaken.lp_Tunnel_Verkeersbuis2_Vluchtdeur_Geluidsbaken) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingAan_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingAan_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingAan_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingAan_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingUit_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingUit_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingUit_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopContourVerlichtingUit_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenAan_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Knop(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Knop.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Knop) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer.lp_Tunnel_Verkeersbuis2_Vluchtdeur_KnopGeluidsbakenUit_Waarnemer) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_Vluchtdeur_SensorOpen(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_Vluchtdeur_SensorOpen.lp_Tunnel_Verkeersbuis2_Vluchtdeur_SensorOpen) {
        }

        // All invariants satisfied.
        return true;
    }

    private static boolean evalStateInvPredsAut_Tunnel_Verkeersbuis2_WisselTimerAudio(State state, boolean initial) {
        // Invariants for current location.
        switch (state.s_Tunnel_Verkeersbuis2_WisselTimerAudio.lp_Tunnel_Verkeersbuis2_WisselTimerAudio) {
        }

        // All invariants satisfied.
        return true;
    }
}
