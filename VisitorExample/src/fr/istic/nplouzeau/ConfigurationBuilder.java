package fr.istic.nplouzeau;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by plouzeau on 2014-06-03.
 */
public final class ConfigurationBuilder {
    private ConfigurationBuilder() {
    }



    static ConfigurationBuilder NewConfigurationBuilder() {
        return new ConfigurationBuilder();
    }

    private class ConfigurationImpl implements Configuration {

        private List<Processor> processors;
        private List<Memory> memories;
        private PowerSupply powerSupply;

        @Override
        public Iterator<Processor> getProcessorIterator() {
            return processors.iterator();
        }

        @Override
        public Iterator<Memory> getMemoryIterator() {
            return memories.iterator();
        }

        @Override
        public PowerSupply getPowerSupply() {
            return powerSupply;
        }

        @Override
        public void accept(Visitor visitor) {

        }
    }

    private class ProcessorImpl implements Processor {

        @Override
        public void accept(Visitor visitor) {

        }

        private class ProcessorCoreImpl implements ProcessorCore {

            @Override
            public double getPowerNeedsInWatts() {
                return 30.0;
            }

            @Override
            public int getMIPS() {
                return 200;
            }
        }

        private List<ProcessorCore> cores = new ArrayList<>();

        @Override
        public Iterator<ProcessorCore> getCoreIterator() {
            return cores.iterator();
        }

        private String id;

        @Override
        public String getId() {
            return id;
        }
    }

    private class ProcessorCoreImpl implements ProcessorCore {

        @Override
        public double getPowerNeedsInWatts() {
            return 30.0;
        }

        @Override
        public int getMIPS() {
            return 200;
        }
    }

    private class DiskImpl implements Disk {

        @Override
        public String getId() {
            return null;
        }

        @Override
        public int getCapacityInBytes() {
            return 0;
        }

        @Override
        public double getPowerNeedsInWatts() {
            return 0;
        }
    }

    private class MemoryModuleImpl implements MemoryModule {

        @Override
        public String getId() {
            return null;
        }

        @Override
        public int getCapacity() {
            return 0;
        }

        @Override
        public void accept(Visitor visitor) {

        }
    }
}
