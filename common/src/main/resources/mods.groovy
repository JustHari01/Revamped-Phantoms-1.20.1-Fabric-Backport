MultiplatformModsDotGroovy.make {
    modLoader = 'javafml'
    loaderVersion = '[1,)'
    issueTrackerUrl = 'https://github.com/JustHari01/Revamped-Phantoms-1.20.1-Fabric-Backport/issues'
    license = 'LGPL-3.0-or-later'

    mod {
        modId = buildProperties.mod_id
        displayName = buildProperties.mod_name
        version = environmentInfo.version
        displayUrl = 'https://github.com/JustHari01/Revamped-Phantoms-1.20.1-Fabric-Backport'
        contact {
            sources = 'https://github.com/JustHari01/Revamped-Phantoms-1.20.1-Fabric-Backport'
        }
        author = 'Luke Bemish'
        description = buildProperties.mod_description

        entrypoints {
            main = 'dev.lukebemish.revampedphantoms.fabric.ModEntrypoint'
        }

        dependencies {
            minecraft = ">=1.20.1 <1.20.2"
            onNeoForge {
                neoforge = ">=${libs.versions.neoforge}"
            }
            onFabric {
                mod 'fabricloader', {
                    versionRange = ">=${libs.versions.fabric_loader}"
                }
                mod 'fabric-api', {
                    versionRange = ">=${libs.versions.fabric_api.split(/\+/)[0]}"
                }
            }
        }
    }
    mixins {
        mixin('mixin.revamped_phantoms.json')
    }
}
