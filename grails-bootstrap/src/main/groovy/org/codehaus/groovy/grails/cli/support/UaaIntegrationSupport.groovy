package org.codehaus.groovy.grails.cli.support

/**
 *  Groovy XML support class for UaaIntegration
 */
class UaaIntegrationSupport {

    /**
     * Finds a plugin in the given plugin list
     *
     * @param pluginList The plugin list
     * @param pluginName The plugin name
     * @return The plugin node
     */
    static findPlugin(pluginList, String pluginName) {
        def plugin =  pluginList.plugin.find { it.@name == pluginName }
        if(plugin) {
            return plugin
        }
        return null
    }
}
