package fr.istic.nplouzeau;

/**
 * Created by plouzeau on 2014-06-02.
 */
public interface Visitor {

    void visitConfiguration(Configuration c);
    void visitProcessor(Processor p);
    void visitProcessorCore(ProcessorCore pc);
    void visitMemoryModule(MemoryModule mm);
    void visitDisk(Disk d);
}
