package com.relivethefuture.formats.ableton;

import com.relivethefuture.formats.SamplerFormat;
import com.relivethefuture.kitbuilder.output.OutputConfig;

/**
 * Created by martin on 08/01/12 at 17:55
 */
public class DrumRackSamplersConfig extends OutputConfig {
    public DrumRackSamplersConfig() {
        setWriter(new AbletonDrumRackSamplersWriter());
        setFormat(SamplerFormat.ABLETON_DRUM_RACK_SAMPLERS);
    }
}
