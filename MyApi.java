/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Nida Khattak
 *  
 */ 
public class MyApi { 
 
    private int count = 0; 
    private int run = 0; 
    private int ignored = 0; 
    private int passed = 0; 
    private int failed = 0; 
 
    public double getSuccessPc() { 
 
        double rtn = 0.0; 
        if (run > 0) { 
 
            final double d = (double) passed / (double) run*100; 
            final BigDecimal bd = BigDecimal.valueOf(d).setScale(1, RoundingMode.HALF_UP); 
            rtn = bd.doubleValue(); 
        } 
        return rtn; 
    } 
 
    public void addCount() { 
        count++; 
    } 
 
    public void addRun() { 
        run++; 
    } 
 
    public void addIgnored() { 
        ignored++; 
    } 
 
    public void addPassed() { 
        passed++; 
    } 
 
    public void addFailed() { 
        failed++; 
    } 
 
    /**
     * @return the count 
     */ 
    public int getCount() { 
        return count; 
    } 
 
    /**
     * @return the run 
     */ 
    public int getRun() { 
        return run; 
    } 
 
    /**
     * @return the ignored 
     */ 
    public int getIgnored() { 
        return ignored; 
    } 
 
    /**
     * @return the passed 
     */ 
    public int getPassed() { 
        return passed; 
    } 
 
    /**
     * @return the failed 
     */ 
    public int getFailed() { 
        return failed; 
    } 
 
    /**
     * @param node 
     */ 
    
    } 
 