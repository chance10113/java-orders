package lambda.school.javaordersproject.services;

import lambda.school.javaordersproject.models.Agent;
import lambda.school.javaordersproject.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "agentServices")
public class AgentServicesImpl implements AgentServices{

    @Autowired
    private AgentRepository agentrepos;

    @Transactional
    @Override
    public Agent save(Agent agent) {return agentrepos.save(agent); }
}
