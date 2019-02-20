---------------------------- MODULE trafficlight ----------------------------
EXTENDS Integers, TLC

(*--algorithm traffic
    variables
        (* Tell TLA what colors are valid for lights *)
        colors = {"red", "green", "yellow"},
        (* Model the state of the lights, as a function from light number (0 or 1)
           to color *)
        lights  = [ l \in {0,1} |-> IF l=0 THEN "green" ELSE "red"],
        (* Which light gets to go green next *)
        next = 1;
    
    (* This section is used to define logical predicates /
       temporal properties that we would like to check of the model
       
       ValidColors *should* be an invariant, because we never set either
       color to "Chartreuse" or some other non-standard traffic light
       color.  You can check this using the model checker. *)
    define
        ValidColors == (\A l \in {0,1}: lights[l] \in colors)
    end define;
    
    (* This block defines the code for each light.  Both run the same code,
       but "self" is bound to 0 in one light and 1 in the other.
       
       The "fair+ process proc \in {0,1}" says there should be two processes
       (roughly, threads, or simultaneously running components), one for each 
       element of the set {0,1}.
    *)
    fair+ process proc \in {0,1}
    begin
        (* While loops in TLA+ must be labelled (a1) *)
        a1: while (TRUE) do
                \* Advance the state of the light when appropriate
        g1:     if (lights[self] = "green") then
        g2:         lights[self] := "yellow";
                elsif (lights[self] = "yellow") then
        y2:         lights[self] := "red";
        y3:         next := self;
                elsif ((lights[self] = "red") /\ (next = self)) then
        r2:         lights[self] := "green";
                end if;
        rpt:    skip;
        end while;
    end process;

end algorithm;*)


=============================================================================
