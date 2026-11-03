package com.example.a30days.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30days.R

data class Audi(
    @DrawableRes val imageResourceId: Int,
    @StringRes val modelo: Int,
    val decada: Int,
    @StringRes val variante: Int,
    val Descripcion: String
)

val audis = listOf(
    Audi(R.drawable.audi100_copue_s_gt,R.string.audi_100, 70, R.string.variante_modelo, "audi 100 ..." ),
    Audi(R.drawable.audi_80___celebrating_50th_birthday, R.string.audi_80_1, 70, R.string.variante_modelo, "audi 80 ..."),
    Audi(R.drawable.audi50, R.string.audi_50, 70, R.string.variante_modelo_2, "audi 50 ..."),
    Audi(R.drawable.audi_200_turbo_2,R.string.audi_200, 70, R.string.variante_modelo_3, "audi 200 ..."),
    Audi(R.drawable.audi_quattro, R.string.audi_quattro, 80, R.string.variante_modelo, "audi quattro ..."),
    Audi(R.drawable.audi_80_cd_01_1024x576, R.string.audi_80_2, 80, R.string.variante_modelo_3, "audi 80 b2 ..."),
    Audi(R.drawable.audi_100_c3__bj_1987, R.string.audi_100_2, 80, R.string.variante_modelo_3, "audi 100 c3 ..."),
    Audi(R.drawable.sport_quattro_calle, R.string.audi_s_quattro, 80, R.string.variante_modelo, "audi sport quattro ..."),
    Audi(R.drawable.vehicle_ad_standard_image_4152b71b513516486eb2e773a40745b7, R.string.audi_coupe_gt, 80, R.string.variante_modelo, "audi coupe gt ..."),
    Audi(R.drawable.sin_t_tulo, R.string.audi_90, 80, R.string.variante_modelo_3, "audi 90 b3"),
    Audi(R.drawable.audi_v8__vf, R.string.audi_v8, 80, R.string.variante_modelo_3, "audi v8 ..."),
    Audi(R.drawable.audi_s2_coupe_1990, R.string.audi_s2_coupe, 90, R.string.variante_modelo, "audi s2 coupe ..."),
    Audi(R.drawable._3_59c929b21e10dae_363_247f5ac71f48cd7, R.string.audi_cabriolet, 90, R.string.variante_modelo_5, "audi cabriolet ..."),
    Audi(R.drawable.large_452a9027_96dc_455f_ba17_a75a312a6adf, R.string.audi_80_3, 90, R.string.variante_modelo_3, "audi 80 b4 ..."),
    Audi(R.drawable.as_22_10_04, R.string.audi_rs2_avant, 90, R.string.variante_modelo_4, "audi rs2 avant ..."),
    Audi(R.drawable.vehicle_ad_standard_image_fa57cb63c8a6d92b7bf5907937dc89db, R.string.audi_a4, 90, R.string.variante_modelo_3, "audi a4 b5 ..."),
    Audi(R.drawable.img_695be61cb263c, R.string.audi_a8, 90, R.string.variante_modelo_3, "audi a8 d2 ..."),
    Audi(R.drawable.audi_a3_1996_2003, R.string.audi_a3, 90, R.string.variante_modelo_2, "audi a3 8l ..."),
    Audi(R.drawable.audi_tt_coupe_8n_3, R.string.audi_tt, 90, R.string.variante_modelo, "audi tt 8n ..."),
    Audi(R.drawable.images, R.string.audi_rs6_avant, 2000, R.string.variante_modelo_4, "audi rs6 avant ..."),
    Audi(R.drawable.audi_a3_8p, R.string.audi_a3_2, 2000, R.string.variante_modelo_2, "audi a3 8p ..."),
    Audi(R.drawable.large_835f8f3a_aedd_49c5_ab01_50dd402b00c7, R.string.audi_a4_2, 2000, R.string.variante_modelo_3, "audi a3 b7 ..."),
    Audi(R.drawable.audi_q7_offroad_style_s_line_3_0_tdi_quattro_tiptronic_phantomschwarz, R.string.audi_q7, 2000, R.string.variante_modelo_6, "audi q7 4l ..."),
    Audi(R.drawable._33aa094d2d6b5451b67023370d0864f4e6fe3406, R.string.audi_r8, 2000, R.string.variante_modelo_7, "audi r8 type 42 ..."),
    Audi(R.drawable.audi_a5, R.string.audi_a5, 2000, R.string.variante_modelo, "audi a5 coupe ..."),
    Audi(R.drawable.audi_a7_sportback_01, R.string.audi_q7, 2010, R.string.variante_modelo_3, "audi a7 sportback ..."),
    Audi(R.drawable.audi_rs3_8v_carbon_fiber_by_rsi_c6_fa1333c7_b7c7_4918_89cb_2d2c181bf12e, R.string.audi_rs3, 2010, R.string.variante_modelo_2, "audi rs3 sportback 8v ..."),
    Audi(R.drawable.audi_rs6, R.string.audi_rs6, 2010, R.string.variante_modelo_4, "audi rs6 avant c8 ..."),
    Audi(R.drawable.audi_rs_e_tron_gt_img_0703, R.string.audi_etron, 2020, R.string.variante_modelo_3, "audi e-tron gt ..."),
    Audi(R.drawable.main_153c9, R.string.audi_q4_etron, 2020, R.string.variante_modelo_6, "audi q4 e-tron ...")


)