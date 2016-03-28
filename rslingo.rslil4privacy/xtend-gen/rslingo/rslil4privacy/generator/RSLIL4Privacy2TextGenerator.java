package rslingo.rslil4privacy.generator;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import rslingo.rslil4privacy.rSLIL4Privacy.Attribute;
import rslingo.rslil4privacy.rSLIL4Privacy.Collection;
import rslingo.rslil4privacy.rSLIL4Privacy.Disclosure;
import rslingo.rslil4privacy.rSLIL4Privacy.Enforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.Informative;
import rslingo.rslil4privacy.rSLIL4Privacy.Metadata;
import rslingo.rslil4privacy.rSLIL4Privacy.Policy;
import rslingo.rslil4privacy.rSLIL4Privacy.PrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.Recipient;
import rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart;
import rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientTarget;
import rslingo.rslil4privacy.rSLIL4Privacy.RefService;
import rslingo.rslil4privacy.rSLIL4Privacy.Retention;
import rslingo.rslil4privacy.rSLIL4Privacy.Service;
import rslingo.rslil4privacy.rSLIL4Privacy.ServicePart;
import rslingo.rslil4privacy.rSLIL4Privacy.Usage;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RSLIL4Privacy2TextGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _plus = (_className + ".txt");
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Policy> _filter = Iterators.<Policy>filter(_allContents, Policy.class);
    final Function1<Policy, CharSequence> _function = (Policy it) -> {
      return this.compile(it);
    };
    Iterator<CharSequence> _map = IteratorExtensions.<Policy, CharSequence>map(_filter, _function);
    String _join = IteratorExtensions.join(_map, " ");
    fsa.generateFile(_plus, _join);
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public CharSequence compile(final Policy policy) {
    StringConcatenation _builder = new StringConcatenation();
    Metadata _metadata = policy.getMetadata();
    String _name = _metadata.getName();
    _builder.append(_name, "");
    _builder.append(" Privacy Policy");
    _builder.newLineIfNotEmpty();
    _builder.append("----------------------------------------");
    _builder.newLine();
    {
      EList<Enforcement> _enforcement = policy.getEnforcement();
      boolean _isEmpty = _enforcement.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLine();
        _builder.append("#Enforcement ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Enforcement> _enforcement_1 = policy.getEnforcement();
          for(final Enforcement e : _enforcement_1) {
            CharSequence _compile = this.compile(e);
            _builder.append(_compile, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Service> _service = policy.getService();
      boolean _isEmpty_1 = _service.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.newLine();
        _builder.append("#Service ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Service> _service_1 = policy.getService();
          for(final Service s : _service_1) {
            CharSequence _compile_1 = this.compile(s);
            _builder.append(_compile_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Recipient> _recipient = policy.getRecipient();
      boolean _isEmpty_2 = _recipient.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.newLine();
        _builder.append("#Recipients ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Recipient> _recipient_1 = policy.getRecipient();
          for(final Recipient r : _recipient_1) {
            CharSequence _compile_2 = this.compile(r);
            _builder.append(_compile_2, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<PrivateData> _privateData = policy.getPrivateData();
      boolean _isEmpty_3 = _privateData.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.newLine();
        _builder.append("#PrivateData ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<PrivateData> _privateData_1 = policy.getPrivateData();
          for(final PrivateData p : _privateData_1) {
            CharSequence _compile_3 = this.compile(p);
            _builder.append(_compile_3, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Collection> _collection = policy.getCollection();
      boolean _isEmpty_4 = _collection.isEmpty();
      boolean _not_4 = (!_isEmpty_4);
      if (_not_4) {
        _builder.newLine();
        _builder.append("#Collection ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Collection> _collection_1 = policy.getCollection();
          for(final Collection c : _collection_1) {
            CharSequence _compile_4 = this.compile(c);
            _builder.append(_compile_4, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Disclosure> _disclosure = policy.getDisclosure();
      boolean _isEmpty_5 = _disclosure.isEmpty();
      boolean _not_5 = (!_isEmpty_5);
      if (_not_5) {
        _builder.newLine();
        _builder.append("#Disclosure ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Disclosure> _disclosure_1 = policy.getDisclosure();
          for(final Disclosure d : _disclosure_1) {
            CharSequence _compile_5 = this.compile(d);
            _builder.append(_compile_5, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Retention> _retention = policy.getRetention();
      boolean _isEmpty_6 = _retention.isEmpty();
      boolean _not_6 = (!_isEmpty_6);
      if (_not_6) {
        _builder.newLine();
        _builder.append("#Retention ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Retention> _retention_1 = policy.getRetention();
          for(final Retention r_1 : _retention_1) {
            CharSequence _compile_6 = this.compile(r_1);
            _builder.append(_compile_6, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Usage> _usage = policy.getUsage();
      boolean _isEmpty_7 = _usage.isEmpty();
      boolean _not_7 = (!_isEmpty_7);
      if (_not_7) {
        _builder.newLine();
        _builder.append("#Usage ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Usage> _usage_1 = policy.getUsage();
          for(final Usage u : _usage_1) {
            CharSequence _compile_7 = this.compile(u);
            _builder.append(_compile_7, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Informative> _informative = policy.getInformative();
      boolean _isEmpty_8 = _informative.isEmpty();
      boolean _not_8 = (!_isEmpty_8);
      if (_not_8) {
        _builder.newLine();
        _builder.append("#Informative ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Informative> _informative_1 = policy.getInformative();
          for(final Informative i : _informative_1) {
            CharSequence _compile_8 = this.compile(i);
            _builder.append(_compile_8, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Enforcement e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _enforcementName = e.getEnforcementName();
    _builder.append(_enforcementName, "");
    _builder.append("(");
    String _type = e.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _description = e.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Service s) {
    StringConcatenation _builder = new StringConcatenation();
    String _serviceName = s.getServiceName();
    _builder.append(_serviceName, "");
    _builder.append(":");
    String _description = s.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<ServicePart> _servicePart = s.getServicePart();
      boolean _isEmpty = _servicePart.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Service_Part:");
        {
          EList<ServicePart> _servicePart_1 = s.getServicePart();
          boolean _hasElements = false;
          for(final ServicePart part : _servicePart_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t");
            }
            CharSequence _compileServicePart = this.compileServicePart(part);
            _builder.append(_compileServicePart, "\t");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<RefPrivateData> _refPrivateData = s.getRefPrivateData();
      boolean _isEmpty_1 = _refPrivateData.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Refers To PrivateData:");
        {
          EList<RefPrivateData> _refPrivateData_1 = s.getRefPrivateData();
          boolean _hasElements_1 = false;
          for(final RefPrivateData part_1 : _refPrivateData_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t");
            }
            CharSequence _compileRefPrivateData = this.compileRefPrivateData(part_1);
            _builder.append(_compileRefPrivateData, "\t");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Recipient r) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = r.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _recipientName = r.getRecipientName();
    _builder.append(_recipientName, "");
    _builder.append("(");
    String _scope = r.getScope();
    _builder.append(_scope, "");
    _builder.append("-");
    String _type = r.getType();
    _builder.append(_type, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    String _description = r.getDescription();
    _builder.append(_description, "   ");
    _builder.append(", ");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    {
      EList<RecipientPart> _recipientPart = r.getRecipientPart();
      boolean _isEmpty = _recipientPart.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Recipient_Part:");
        {
          EList<RecipientPart> _recipientPart_1 = r.getRecipientPart();
          boolean _hasElements = false;
          for(final RecipientPart part : _recipientPart_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "   ");
            }
            CharSequence _compileRecipientPart = this.compileRecipientPart(part);
            _builder.append(_compileRecipientPart, "   ");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final PrivateData p) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = p.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _type = p.getType();
    _builder.append(_type, "");
    _builder.append("): ");
    String _description = p.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Attribute:");
    {
      EList<Attribute> _attribute = p.getAttribute();
      boolean _hasElements = false;
      for(final Attribute a : _attribute) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        CharSequence _compile = this.compile(a);
        _builder.append(_compile, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _name_1 = a.getName();
    _builder.append(_name_1, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence compile(final Collection c) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = c.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _modality = c.getModality();
    _builder.append(_modality, "");
    _builder.append("):");
    String _description = c.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<RefService> _refService = c.getRefService();
      boolean _isEmpty = _refService.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Refers To Service:");
        {
          EList<RefService> _refService_1 = c.getRefService();
          boolean _hasElements = false;
          for(final RefService s : _refService_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefService = this.compileRefService(s);
            _builder.append(_compileRefService, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefPrivateData> _refPrivateData = c.getRefPrivateData();
      boolean _isEmpty_1 = _refPrivateData.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Refers To PrivateData:");
        {
          EList<RefPrivateData> _refPrivateData_1 = c.getRefPrivateData();
          boolean _hasElements_1 = false;
          for(final RefPrivateData p : _refPrivateData_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefPrivateData = this.compileRefPrivateData(p);
            _builder.append(_compileRefPrivateData, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefEnforcement> _refEnforcement = c.getRefEnforcement();
      boolean _isEmpty_2 = _refEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("Refers To Enforcement:");
        {
          EList<RefEnforcement> _refEnforcement_1 = c.getRefEnforcement();
          boolean _hasElements_2 = false;
          for(final RefEnforcement e : _refEnforcement_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefEnforcement = this.compileRefEnforcement(e);
            _builder.append(_compileRefEnforcement, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Disclosure d) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = d.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _modality = d.getModality();
    _builder.append(_modality, "");
    _builder.append("):");
    String _description = d.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<RefRecipientTarget> _refRecipientTarget = d.getRefRecipientTarget();
      boolean _isEmpty = _refRecipientTarget.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Refers To Recipient:");
        {
          EList<RefRecipientTarget> _refRecipientTarget_1 = d.getRefRecipientTarget();
          boolean _hasElements = false;
          for(final RefRecipientTarget p : _refRecipientTarget_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefRecipientTarget = this.compileRefRecipientTarget(p);
            _builder.append(_compileRefRecipientTarget, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefService> _refService = d.getRefService();
      boolean _isEmpty_1 = _refService.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Refers To Service:");
        {
          EList<RefService> _refService_1 = d.getRefService();
          boolean _hasElements_1 = false;
          for(final RefService s : _refService_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefService = this.compileRefService(s);
            _builder.append(_compileRefService, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefPrivateData> _refPrivateData = d.getRefPrivateData();
      boolean _isEmpty_2 = _refPrivateData.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("Refers To PrivateData:");
        {
          EList<RefPrivateData> _refPrivateData_1 = d.getRefPrivateData();
          boolean _hasElements_2 = false;
          for(final RefPrivateData p_1 : _refPrivateData_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefPrivateData = this.compileRefPrivateData(p_1);
            _builder.append(_compileRefPrivateData, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefEnforcement> _refEnforcement = d.getRefEnforcement();
      boolean _isEmpty_3 = _refEnforcement.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("Refers To Enforcement:");
        {
          EList<RefEnforcement> _refEnforcement_1 = d.getRefEnforcement();
          boolean _hasElements_3 = false;
          for(final RefEnforcement e : _refEnforcement_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefEnforcement = this.compileRefEnforcement(e);
            _builder.append(_compileRefEnforcement, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Retention r) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = r.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _modality = r.getModality();
    _builder.append(_modality, "");
    _builder.append("-");
    String _period = r.getPeriod();
    _builder.append(_period, "");
    _builder.append("):");
    String _description = r.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<RefService> _refService = r.getRefService();
      boolean _isEmpty = _refService.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Refers To Service:");
        {
          EList<RefService> _refService_1 = r.getRefService();
          boolean _hasElements = false;
          for(final RefService s : _refService_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefService = this.compileRefService(s);
            _builder.append(_compileRefService, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefPrivateData> _refPrivateData = r.getRefPrivateData();
      boolean _isEmpty_1 = _refPrivateData.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Refers To PrivateData:");
        {
          EList<RefPrivateData> _refPrivateData_1 = r.getRefPrivateData();
          boolean _hasElements_1 = false;
          for(final RefPrivateData p : _refPrivateData_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefPrivateData = this.compileRefPrivateData(p);
            _builder.append(_compileRefPrivateData, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefEnforcement> _refEnforcement = r.getRefEnforcement();
      boolean _isEmpty_2 = _refEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("Refers To Enforcement:");
        {
          EList<RefEnforcement> _refEnforcement_1 = r.getRefEnforcement();
          boolean _hasElements_2 = false;
          for(final RefEnforcement e : _refEnforcement_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefEnforcement = this.compileRefEnforcement(e);
            _builder.append(_compileRefEnforcement, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Usage u) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = u.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _modality = u.getModality();
    _builder.append(_modality, "");
    _builder.append("):");
    String _description = u.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<RefService> _refService = u.getRefService();
      boolean _isEmpty = _refService.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Refers To Service:");
        {
          EList<RefService> _refService_1 = u.getRefService();
          boolean _hasElements = false;
          for(final RefService b : _refService_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefService = this.compileRefService(b);
            _builder.append(_compileRefService, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefPrivateData> _refPrivateData = u.getRefPrivateData();
      boolean _isEmpty_1 = _refPrivateData.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Refers To PrivateData:");
        {
          EList<RefPrivateData> _refPrivateData_1 = u.getRefPrivateData();
          boolean _hasElements_1 = false;
          for(final RefPrivateData p : _refPrivateData_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefPrivateData = this.compileRefPrivateData(p);
            _builder.append(_compileRefPrivateData, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefEnforcement> _refEnforcement = u.getRefEnforcement();
      boolean _isEmpty_2 = _refEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("Refers To Enforcement:");
        {
          EList<RefEnforcement> _refEnforcement_1 = u.getRefEnforcement();
          boolean _hasElements_2 = false;
          for(final RefEnforcement e : _refEnforcement_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefEnforcement = this.compileRefEnforcement(e);
            _builder.append(_compileRefEnforcement, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Informative i) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = i.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _modality = i.getModality();
    _builder.append(_modality, "");
    _builder.append("):");
    String _description = i.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<RefService> _refService = i.getRefService();
      boolean _isEmpty = _refService.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Refers To Service:");
        {
          EList<RefService> _refService_1 = i.getRefService();
          boolean _hasElements = false;
          for(final RefService s : _refService_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefService = this.compileRefService(s);
            _builder.append(_compileRefService, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefPrivateData> _refPrivateData = i.getRefPrivateData();
      boolean _isEmpty_1 = _refPrivateData.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Refers To PrivateData:");
        {
          EList<RefPrivateData> _refPrivateData_1 = i.getRefPrivateData();
          boolean _hasElements_1 = false;
          for(final RefPrivateData p : _refPrivateData_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefPrivateData = this.compileRefPrivateData(p);
            _builder.append(_compileRefPrivateData, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefEnforcement> _refEnforcement = i.getRefEnforcement();
      boolean _isEmpty_2 = _refEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("Refers To Enforcement:");
        {
          EList<RefEnforcement> _refEnforcement_1 = i.getRefEnforcement();
          boolean _hasElements_2 = false;
          for(final RefEnforcement e : _refEnforcement_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileRefEnforcement = this.compileRefEnforcement(e);
            _builder.append(_compileRefEnforcement, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilePeriod(final Retention r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("   ");
    _builder.append("Retention Period:");
    String _period = r.getPeriod();
    _builder.append(_period, "   ");
    return _builder;
  }
  
  public CharSequence compileRefRecipientTarget(final RefRecipientTarget r) {
    StringConcatenation _builder = new StringConcatenation();
    Recipient _refRecipientTarget = r.getRefRecipientTarget();
    String _name = _refRecipientTarget.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compileRefService(final RefService r) {
    StringConcatenation _builder = new StringConcatenation();
    Service _refService = r.getRefService();
    String _name = _refService.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compileServicePart(final ServicePart s) {
    StringConcatenation _builder = new StringConcatenation();
    Service _servicePart = s.getServicePart();
    String _name = _servicePart.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compileRefPrivateData(final RefPrivateData r) {
    StringConcatenation _builder = new StringConcatenation();
    PrivateData _refPrivateData = r.getRefPrivateData();
    String _name = _refPrivateData.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compileRecipientPart(final RecipientPart r) {
    StringConcatenation _builder = new StringConcatenation();
    Recipient _recipientPart = r.getRecipientPart();
    String _name = _recipientPart.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compileRefEnforcement(final RefEnforcement e) {
    StringConcatenation _builder = new StringConcatenation();
    Enforcement _refEnforcement = e.getRefEnforcement();
    String _name = _refEnforcement.getName();
    _builder.append(_name, "");
    return _builder;
  }
}
