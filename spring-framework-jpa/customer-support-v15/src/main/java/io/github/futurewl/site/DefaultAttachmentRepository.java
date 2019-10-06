package io.github.futurewl.site;

import io.github.futurewl.site.entities.Attachment;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultAttachmentRepository
        extends GenericJpaRepository<Long, Attachment>
        implements AttachmentRepository {
    @Override
    public Iterable<Attachment> getByTicketId(long ticketId) {
        return this.entityManager.createQuery(
                "SELECT a FROM Attachment a WHERE a.ticketId = :id ORDER BY a.id",
                Attachment.class
        ).setParameter("id", ticketId).getResultList();
    }
}
