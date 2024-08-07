package com.calmwolfs.valorantmodelapi.enums

import com.calmwolfs.valorantmodelapi.ValorantModelApi
import com.calmwolfs.valorantmodelapi.models.StoreBundle

enum class StoreBundleType(val displayName: String, val uuid: String) {
    ABYSSAL("Abyssal", "afa6651a-4b93-b7f8-b136-b6b081fc3258"),
    AEMONDIR("Aemondir", "00f15574-4c2e-992c-1664-0c8969f2d7a3"),
    ALTITUDE("Altitude", "a4937ee9-4148-8ff2-2c11-c28891880306"),
    ARAXYS("Araxys", "a4c613c9-4970-61ca-e52a-918ae22f5315"),
    ARCANE("Arcane", "2270b116-4255-8a14-4486-db9de4979b89"),
    AVALANCHE("Avalanche", "0dee7ef6-d3ea-400a-b15c-5b9524243439"),
    BLACKMARKET("Black.Market", "82a56e4c-4de3-0195-4889-788992b2790d"),
    BLASTX("BlastX", "a31f7d1f-89d8-47ae-875b-1ae2117655c2"),
    CELESTIAL("Celestial", "473e694c-4940-078b-fb49-e994dff766cf"),
    CHAMPIONS_2021("Champions 2021", "bf987f36-4a33-45e4-3c49-1ab9a2502607"),
    CHAMPIONS_2022("Champions 2022", "f99e5b38-48c7-1146-acfa-9baaf773b844"),
    CHAMPIONS_2023("Champions 2023", "90ee89df-40cf-03d3-420f-3d9a1b81d85b"),
    CHROMEDEK("Chromedek", "3ed0b915-47b6-2647-7c90-26badf119086"),
    CHRONOVOID("ChronoVoid", "a5da7b5a-49a4-8fa9-a1c6-01a9aced0f9f"),
    CRIMSONBEAST("Crimsonbeast", "bd4f586d-469c-731d-5018-19835db2b086"),
    CRYOSTASIS("Cryostasis", "3ae56d5e-423d-97c5-1aa2-4faccccec1a2"),
    DAYDREAMS("Daydreams", "7c30157f-4e5d-c929-3c9d-5988d3480105"),
    DOODLE_BUDS("Doodle Buds", "2ed936df-4959-acc7-9aca-358d34a50619"),
    DUOS_DAY("Duo's Day", "c877d56c-4fcd-ae60-9617-b8a3542e72fb"),
    EGO("Ego", "2d6ec1d9-4152-8a43-5f7f-ff96b29c857f"),
    ELDERFLAME("Elderflame", "1ba50cf0-46dd-848f-13a9-dc92fb0a3e3b"),
    EMBERCLAD("Emberclad", "f0e4460a-45ce-728b-1cda-79801e646dc5"),
    ENDEAVOUR("Endeavour", "957f55ff-48a1-d0e2-41b1-ca89bf036b6e"),
    EVORI_DREAMWINGS("Evori Dreamwings", "f94649de-4723-b138-8293-45ab433c9da4"),
    FORSAKEN("Forsaken", "1b98ee1c-4d9a-9e9d-0b36-f1a001a76628"),
    FORTUNES_HAND("Fortune's Hand", "72312105-4ad8-3b6b-4853-38ac2fcbbdf8"),
    GAIAS_VENGEANCE_1("Gaia's Vengeance", "3d580e29-435b-8e65-22f4-3c8b8974f5fd"),
    GAIAS_VENGEANCE_2("Gaia's Vengeance", "e10e00ae-4dcc-3c4a-16f7-7e885314f0d0"),
    GIVE_BACK("Give Back", "441117e1-40be-42e2-3aeb-49957e5c03fd"),
    GIVE_BACK_2022("Give Back // 2022", "35a66d96-4c72-ea81-f09e-43a967b64c66"),
    GIVE_BACK_2023("Give Back // 2023", "2fcd19c4-4189-42dd-903b-e59a0dbf8f29"),
    GIVE_BACK_2024("Give Back // 2024", "bd9377a2-47ce-4223-f4e2-c199e84cea1d"),
    GLITCHPOP_1("Glitchpop", "05e8add9-404d-5d37-8973-9f93f8880e2d"),
    GLITCHPOP_2("Glitchpop", "fc723fef-444a-4013-a741-3e85a97382f2"),
    GRAVITATIONAL_URANIUM_NEUROBLASTER("Gravitational Uranium Neuroblaster", "e84d5a16-462f-6fbf-bee0-5a80191a19e5"),
    HOLOMOKU("Holomoku", "32469bcf-4748-cbb7-cadb-8fab251a797d"),
    HORIZON("Horizon", "abba1438-4900-ce9b-8b81-38b6975a419f"),
    IGNITE("Ignite", "3bd7465d-4257-8583-c563-188ae47cc7c6"),
    IMPERIUM("Imperium", "e6032bbf-403e-47e4-8fbc-a1b212d966e7"),
    INFANTRY("Infantry", "9be3549b-4124-7fc2-aa79-8d817f728a18"),
    INTERGRADE("Intergrade", "2bec0257-49a2-77ac-718b-09af04de6a9e"),
    ION_1("Ion", "693d675e-4ed2-c00a-5e38-6b859b275565"),
    ION_2("Ion", "790f52c4-4ed8-9869-fa8b-bf92fc24b441"),
    KOHAKU_MATSUBA("Kohaku & Matsuba", "31827d9c-4ccb-8687-a5c1-69991ad1ec98"),
    KURONAMI("Kuronami", "a012ba57-4a6a-db6b-fad2-bebb84a9a588"),
    LUNA("Luna", "ef488eb7-4405-3b3f-7fd1-63af0824a639"),
    LUXE("Luxe", "1703b166-4e32-63da-9d16-a7a144aab574"),
    MAGEPUNK_1("Magepunk", "338cabdb-473f-1f37-fa35-47a3d994517f"),
    MAGEPUNK_2("Magepunk", "61215a36-435b-9c3e-73e0-25906a3ffe06"),
    MAGEPUNK_3("Magepunk", "a981af4a-4d81-9668-8923-9c84c43da3d3"),
    MINIMA("Minima", "cd095669-4a29-a7f3-e00d-f694186863cc"),
    MKVII_LIBERTY("MK.VII Liberty", "dd6f36b7-45c4-cdf7-10c4-dabca738c5fc"),
    MYSTBLOOM("Mystbloom", "dec7c18d-469b-c1d1-ada5-2ebf1eaf2a5c"),
    NEBULA("Nebula", "c520fbb0-492c-960e-8b77-f69fc4ce1838"),
    NEO_FRONTIER("Neo Frontier", "550d9d34-4942-a605-ba3c-b09452e52f83"),
    NEPTUNE("Neptune", "ce15405a-4471-3290-1a16-abab355f97da"),
    NO_LIMITS("NO LIMITS", "dcf781ee-4f66-8dac-cfaa-e2ad412bce32"),
    NUNCA_OLVIDADOS("Nunca Olvidados", "a4d5c5f5-4647-d984-011d-dea2ef7b56c5"),
    ONI_1("Oni", "b7d754d4-44aa-4663-afc3-84a5cccc3c9d"),
    ONI_2("Oni", "ebfb909d-45ba-c514-3369-55bf014ba293"),
    ORIGIN("Origin", "54f8793c-4daa-6e45-bcfd-e9bfc742dc30"),
    ORION("Orion", "e4c7da33-4e16-8eb5-ad4d-388753a0e179"),
    OVERDRIVE("Overdrive", "3ad3de55-422b-4076-a89f-81a38ce24973"),
    PRELUDE_TO_CHAOS("Prelude to Chaos", "526f7d0c-414b-24bb-bcd0-10aed1f3e824"),
    PRIDE("Pride", "7b6b00f0-4fb9-7395-067d-44bcb4e20d9a"),
    PRIME("Prime", "2116a38e-4b71-f169-0d16-ce9289af4bfa"),
    PRIME20("Prime//2.0", "de041dd5-4e17-2924-6d09-b4a3ccd82e6f"),
    PRIMORDIUM("Primordium", "22ad3cea-4b3e-b6e9-e1ee-c498a45f14ee"),
    PRISM("Prism", "ce6c1fa1-4eae-6db9-779f-f6988b866de4"),
    PRISM_II("Prism II", "224ddcc4-4a2b-cc61-01a2-97835777b3f6"),
    PROTOCOL_781_A("Protocol 781-A", "ab83f73d-485f-e010-8ea0-24b538468a1a"),
    RADIANT_CRISIS_001("Radiant Crisis 001", "3a824027-4414-5a08-64f0-c8905a2aaa66"),
    RADIANT_ENTERTAINMENT_SYSTEM("Radiant Entertainment System", "3d2fd628-4ceb-0029-a737-9682ce8eb5e9"),
    REAVER_1("Reaver", "81d85522-4651-4f66-72de-5fa057b3514c"),
    REAVER_2("Reaver", "f7dcf7e1-485e-0524-ec82-0d97b2c8b40b"),
    RECON("Recon", "b6b1b7ea-4a10-f810-a416-03adbb69d379"),
    REVERIE("Reverie", "9a4ad6ad-4aa9-695a-b73e-cf874223db0c"),
    RGX_11Z_PRO_1("RGX 11z Pro", "d958b181-4e7b-dc60-7c3c-e3a3a376a8d2"),
    RGX_11Z_PRO_2("RGX 11z Pro", "ed453815-44aa-4c4d-f3aa-77b4bcf048d7"),
    RUINATION("Ruination", "ae0c9cc4-4c03-f8d6-745c-84953db684fc"),
    RUN_IT_BACK_1("Run It Back", "332d705c-4852-11e5-c590-88b1f6e47f72"),
    RUN_IT_BACK_2("Run It Back", "9d801e67-4b33-4d99-04b8-aab317819a4e"),
    RUN_IT_BACK_3("Run It Back", "a6fa35c6-4205-d5bc-dd65-3b92aeaac412"),
    RUN_IT_BACK_4("Run It Back", "bcdd8956-4588-f586-fda8-fd991c593449"),
    RUN_IT_BACK_5("Run It Back", "d2ddd2a1-49d5-6ebc-eb62-cb8a5798da6a"),
    SAKURA("Sakura", "49d7951e-4e5d-304c-31a0-589b79096d5a"),
    SARMAD("Sarmad", "83e78a53-435b-f891-9e04-a9b59ed8fa44"),
    SENSATION("Sensation", "54cbf45c-4b92-5cd9-07ab-3d98175fafa6"),
    SENTINELS_OF_LIGHT_1("Sentinels of Light", "13d427c1-49d7-44f9-6576-27a9c83d787f"),
    SENTINELS_OF_LIGHT_2("Sentinels of Light", "753739e7-4447-617c-8253-cf8d9d577b58"),
    SILVANUS("Silvanus", "3aaeac8c-469f-bf29-7802-a09cc8729a3e"),
    SINGULARITY("Singularity", "ef72e3c0-467b-ab15-076a-1e9690d16d6f"),
    SMITE("Smite", "adec612c-4c82-a4b2-a5f2-b7909e638a67"),
    SNOWFALL("Snowfall", "8a3507cd-44ef-0695-1d66-4da0f87e7522"),
    SOULSTRIFE("Soulstrife", "bd94a6b3-4dfc-d333-8ba0-82a34d924ed7"),
    SOVEREIGN_1("Sovereign", "fd9fd08f-446f-018f-c632-0e96428f2978"),
    SOVEREIGN_2("Sovereign", "fda6c6a8-4ec7-1138-897a-658e08197169"),
    SPECTRUM("Spectrum", "f7f37856-4af7-9b0e-08aa-91a5207c0439"),
    SPLINE("Spline", "c1b255e2-411d-b159-6da3-5ab6c011a8cf"),
    SWITCHBACK("Switchback", "fe884e91-4079-7a94-4cf5-ae85cef9e9f6"),
    TEAM_ACE("Team Ace", "f7bf90a6-4e39-6c04-c12a-b79c8842359c"),
    TETHERED_REALMS("Tethered Realms", "1b632bcd-4e3d-eb8e-cca6-cebf937e6ebb"),
    THROWBACK_PACK_OUTLAW("Throwback Pack: Outlaw ", "a042042c-40f3-df48-dbaa-4bbbd6324ba7"),
    TIGRIS("Tigris", "f1befd6b-4270-01b6-8a43-06b52fa417ae"),
    TITANMAIL("Titanmail", "866ce9c2-4493-daba-a025-7c805c4e3eed"),
    UNDERCITY("Undercity", "d84cd2bf-42e5-34e8-062f-cba8d2c66fb2"),
    VALIANT_HERO("Valiant Hero", "f79f85ec-48f8-6573-873a-75b4627b615e"),
    VALORANT_GO_VOL_1("VALORANT GO! Vol. 1", "b37b6a01-40f9-af81-ed34-fd8563539d44"),
    VALORANT_GO_VOL_2("VALORANT GO! Vol. 2", "5c8b9297-465f-080c-3c0d-c9b9811432ed"),
    VCT_CN_TEAM_CAPSULES("VCT CN TEAM CAPSULES", "e9152a68-4093-6e86-7da0-c8977024c2c4"),
    VCT_LOCKIN("VCT LOCK//IN", "2654d506-4d05-e7e9-c996-63ac6fdaf767"),
    VCT_TEAM_CAPSULES("VCT TEAM CAPSULES", "26333e26-4688-3e1e-3c7c-1ab6bf16ceec"),
    VCT_X_100T("VCT x 100T", "32bded83-4a99-3efb-c549-8ba97d5db99a"),
    VCT_X_AG("VCT x AG", "28f40987-4c73-669d-d990-bbbe84af5521"),
    VCT_X_BBL("VCT x BBL", "344bf553-4168-397c-9d7d-a4bfa5aeb68a"),
    VCT_X_BLD("VCT x BLD", "ada117e5-4bae-c704-de94-c5a3246c3664"),
    VCT_X_BLG("VCT x BLG", "440c7d5d-4581-8a56-4966-d98385dd50f0"),
    VCT_X_C9("VCT x C9", "1a9b1b7b-4123-a1d1-3352-b9be6458dede"),
    VCT_X_DFM("VCT x DFM", "480b426d-4b04-76f2-8465-57897bd3e244"),
    VCT_X_DRG("VCT x DRG", "d53bb083-4dee-e698-60fa-acbe1d71306e"),
    VCT_X_DRX("VCT x DRX", "7a1a52d2-4e27-5d7e-b858-a6bd185342c2"),
    VCT_X_EDG("VCT x EDG", "de1d35f2-4711-ecb6-f4f0-5192e74ae9dc"),
    VCT_X_EG("VCT x EG", "b71158fe-483d-24d9-ef84-f583342aec7e"),
    VCT_X_FNC("VCT x FNC", "a4e0b3bb-4c8a-06f2-c37c-2cbd5e0e68c8"),
    VCT_X_FPX("VCT x FPX", "72c9f9d0-4e44-e78d-7a9d-709f204fdc42"),
    VCT_X_FUR("VCT x FUR", "8b55c656-4917-b4fb-14da-9cbd52e5a4ac"),
    VCT_X_FUT("VCT x FUT", "63a7bd33-4fb7-d17d-1564-138e82c10b21"),
    VCT_X_G2("VCT x G2", "816f1b9f-431f-c029-62cb-ddb8932cf8be"),
    VCT_X_GE("VCT x GE", "3ad6d97b-4ed6-16e3-62e2-4eae0b31439c"),
    VCT_X_GEN("VCT x GEN", "6c4ceac0-4d4b-3f4f-f9ad-df9b353c59cd"),
    VCT_X_GX("VCT x GX", "d906185e-448c-168b-7392-bbb997f22d6f"),
    VCT_X_JDG("VCT x JDG", "4289b941-4bca-3f59-d5c1-368ae30c2b4d"),
    VCT_X_KC("VCT x KC", "a2c8eeb0-4111-c305-97e4-c196a6dc90fe"),
    VCT_X_KOI("VCT x KOI", "53ab69ca-4106-222f-1108-2c8b0e37fc8c"),
    VCT_X_KRU("VCT x KRÜ", "9374455b-42eb-279a-ac16-78ab89a4a259"),
    VCT_X_LEV("VCT x LEV", "8fd1fe02-4337-40d6-ce06-51b047e0db1e"),
    VCT_X_LOUD("VCT x LOUD", "10363d3f-4fed-b351-b8c8-7a8b5faf4e59"),
    VCT_X_M8("VCT x M8", "c110bd5d-4520-2583-2481-b9b021a4579b"),
    VCT_X_MIBR("VCT x MIBR", "48877ea3-4eca-8841-6535-4db618d06af7"),
    VCT_X_NAVI("VCT x NAVI", "117eb86a-4535-03a4-0164-96800efaba8a"),
    VCT_X_NOVA("VCT x NOVA", "99ee9d58-4b3b-0e50-6848-84af61da2768"),
    VCT_X_NRG("VCT x NRG", "2fafe248-4890-79cf-bfd4-4691d7d32651"),
    VCT_X_PRX("VCT x PRX", "12095a0a-4c66-5b4b-f2e4-fe9b08027e6e"),
    VCT_X_RRQ("VCT x RRQ", "efb4a515-480e-12cd-e0fc-a0a96ef1c2c0"),
    VCT_X_SEN("VCT x SEN", "6e5ebf52-42e9-fc40-ab98-2eac16f74eaf"),
    VCT_X_T1("VCT x T1", "1cfb033a-4569-0690-a2d0-0a826a5ec363"),
    VCT_X_TE("VCT x TE", "7333f7de-48d7-9217-cb99-b6893b16f33f"),
    VCT_X_TEC("VCT x TEC", "e2a35d90-43c3-1f09-228b-2cb901f6f437"),
    VCT_X_TH("VCT x TH", "f8f7a18d-4781-5518-82a5-1daabfdec01c"),
    VCT_X_TL("VCT x TL", "a4384542-4f5a-e31f-1e4e-fb875160ce91"),
    VCT_X_TLN("VCT x TLN", "a2f641cd-461d-909c-d21e-1db2b4a4c964"),
    VCT_X_TS("VCT x TS", "e92ad258-4121-76da-92b8-7ab3e0446979"),
    VCT_X_TYL("VCT x TYL", "a29cc5fa-464d-f7ff-2de1-1da07eae7229"),
    VCT_X_VIT("VCT x VIT", "240f2ec5-49f2-c575-0fbb-4c9c2b07c154"),
    VCT_X_WOL("VCT x WOL", "0667837d-42f6-a5e9-409a-6eab70b0d330"),
    VCT_X_ZETA("VCT x ZETA", "285ce9b7-4eff-19af-8370-7fb2e62b05c5"),
    WASTELAND("Wasteland", "4e3a244b-4482-0541-3eab-b8912cdb72d6"),
    WINTERWUNDERLAND("Winterwunderland", "79d2f4b9-4066-8b5b-884f-1d95b33d2ac5"),
    XENOHUNTER("Xenohunter", "3941ad01-4e3b-46e0-ba3a-ab94f7c67f98"),
    XER0FANG("XERØFANG", "8b97b3f5-4555-6818-5ed0-18b1fb4e1336"),
    UNKNOWN("Unknown", "")
    ;

    override fun toString(): String {
        return displayName
    }

    val storeBundle: StoreBundle?
        get() = runCatching { ValorantModelApi.getStoreBundle(this) }.getOrNull()

    companion object {
        fun fromId(id: String?): StoreBundleType {
            return entries.find { it.uuid == id } ?: run {
                ValorantModelApi.logUnknownId(id, StoreBundleType)
                UNKNOWN
            }
        }

        fun fromName(displayName: String): StoreBundleType {
            return entries.find { it.displayName == displayName } ?: UNKNOWN
        }
    }
}
