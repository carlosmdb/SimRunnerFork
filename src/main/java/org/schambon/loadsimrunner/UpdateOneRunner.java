package org.schambon.loadsimrunner;

import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;

import org.bson.Document;

public class UpdateOneRunner extends AbstractUpdateRunner {

    public UpdateOneRunner(WorkloadConfiguration workloadConfiguration, Reporter reporter) {
        super(workloadConfiguration, reporter);
    }

    @Override
    protected UpdateResult doUpdate(Document filter, Document update, UpdateOptions options) {
        return mongoColl.updateOne(filter, update, options);
    }

 
    
}