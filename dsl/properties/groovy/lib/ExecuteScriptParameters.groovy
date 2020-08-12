
// DO NOT EDIT THIS BLOCK BELOW=== Parameters starts ===
// PLEASE DO NOT EDIT THIS FILE

import com.cloudbees.flowpdf.StepParameters

class ExecuteScriptParameters {
    /**
    * Label: File Path, type: entry
    */
    String scriptPath
    /**
    * Label: Script text, type: textarea
    */
    String scriptText

    static ExecuteScriptParameters initParameters(StepParameters sp) {
        ExecuteScriptParameters parameters = new ExecuteScriptParameters()

        def scriptPath = sp.getParameter('scriptPath').value
        parameters.scriptPath = scriptPath
        def scriptText = sp.getParameter('scriptText').value
        parameters.scriptText = scriptText

        return parameters
    }
}
// DO NOT EDIT THIS BLOCK ABOVE ^^^=== Parameters ends, checksum: 4de9f71ca8749628ce1f6fc1b0c68b7d ===
