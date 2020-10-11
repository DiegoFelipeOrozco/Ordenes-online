package com.jualjodi.Store.Pipes.implementations;

import com.jualjodi.Store.Pipes.Pipe;
import com.jualjodi.Store.Pipes.InvalidOperationException;
import com.jualjodi.Store.WebRequest;
import com.jualjodi.Store.WebResponse;

public class Sanitizer extends Pipe {
    @Override
    protected WebResponse validate(WebRequest request) throws InvalidOperationException {
        return null;
    }
}
